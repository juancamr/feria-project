package controlador;

import dao.CRUDFeria;
import dao.CRUDGasto;
import dao.CRUDIngreso;
import dao.CRUDReporte;
import formato.FormatoFinanzas;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import modelo.Feria;
import modelo.Gasto;
import modelo.Ingreso;
import modelo.Reporte;
import modelo.Response;
import utils.DebugObject;
import utils.Dialog;
import utils.FormatFrame;
import utils.Go;
import utils.Utils;
import vista.PanelFinanzas;
import vista.WindowMain;

public class ControladorFinanzas implements ActionListener {

    PanelFinanzas panel;
    WindowMain vistaa;
    Feria feria;
    Reporte reporte;

    public ControladorFinanzas(WindowMain vista, PanelFinanzas p) {
        panel = p;
        vistaa = vista;
        panel.jbtnAgregarGasto.addActionListener(this);
        panel.jbtnAgregarIngreso.addActionListener(this);
        panel.jbtnAprobar.addActionListener(this);

        Response<Feria> rsFeria = CRUDFeria.getInstance().isFeriaBeingRun();
        feria = rsFeria.getData();
        if (!rsFeria.isSuccess()) {
            Go.toRegistroFeria(vista);
            Dialog.message("Por favor, primero registre una feria");
        } else {
            Response<Reporte> rsReporte = CRUDReporte.getInstance().getByFeria(feria.getId());
            reporte = rsReporte.getData();
            panel.jlblFeriaActual.setText(feria.getNombre());
            getGastoAcumulado();
            getIngresoAcumulado();
            FormatFrame.panel(vista, panel);
        }
    }

    private void getGastoAcumulado() {
        Response<Gasto> rsGasto = CRUDGasto.getInstance().getMany(reporte.getId());
        double sumaGasto = Utils.calculateSum(rsGasto.getDataList().stream()
                .map(gasto -> gasto.getAmount()).collect(Collectors.toList()));
        panel.jlblGastoAcumulado.setText(Utils.balanceFormat(sumaGasto));
    }

    private void getIngresoAcumulado() {
        Response<Ingreso> rsIngreso = CRUDIngreso.getInstance().getMany(reporte.getId());
        double sumaIngreso = Utils.calculateSum(rsIngreso.getDataList().stream()
                .map(ingreso -> ingreso.getAmount()).collect(Collectors.toList()));
        panel.jlblIngresoAcumulado.setText(Utils.balanceFormat(sumaIngreso));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnAprobar) {
            if (Dialog.confirm("Desea generar el reporte? La feria sera cerrada")) {
                CRUDFeria.getInstance().setClose(feria.getId());
                Go.toHome(vistaa);
            }
        }
        if (e.getSource() == panel.jbtnAgregarGasto) {
            Gasto gasto = new Gasto.Builder()
                    .id(0)
                    .idReporte(reporte.getId())
                    .detalle(panel.jtxtDetalleGasto.getText())
                    .amount(Double.parseDouble(panel.spnGastos.getValue().toString()))
                    .build();
            if (DebugObject.isFilledObject(gasto)) {
                Response<Gasto> rsGasto = CRUDGasto.getInstance().add(gasto);
                if (rsGasto.isSuccess()) {
                    getGastoAcumulado();
                    FormatoFinanzas.emptyGastoFields(panel);
                } else {
                    Dialog.message(rsGasto.getMessage());
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }

        if (e.getSource() == panel.jbtnAgregarIngreso) {
            Ingreso ingreso = new Ingreso.Builder()
                    .id(0)
                    .idReporte(reporte.getId())
                    .detalle(panel.jtxtDetalleIngreso.getText())
                    .amount(Double.parseDouble(panel.spnIngresos.getValue().toString()))
                    .build();
            
            if (DebugObject.isFilledObject(ingreso)) {
                Response<Ingreso> rsIngreso = CRUDIngreso.getInstance().add(ingreso);
                if (rsIngreso.isSuccess()) {
                    getIngresoAcumulado();
                    FormatoFinanzas.emptyIngresoFields(panel);
                } else {
                    Dialog.message(rsIngreso.getMessage());
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

}
