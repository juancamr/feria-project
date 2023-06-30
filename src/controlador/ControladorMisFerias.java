package controlador;

import dao.CRUDReporte;
import formato.FormatTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Reporte;
import modelo.Response;
import utils.Dialog;
import utils.FormatFrame;
import vista.PanelMisFerias;
import vista.WindowMain;

public class ControladorMisFerias implements ActionListener {

    PanelMisFerias panel;
    DefaultTableModel modelo;
    private final String[] titulos = {"Nombre de la feria", "Reporte", "Cuadro estadistico", "Fecha"};

    public ControladorMisFerias(WindowMain vista, PanelMisFerias p) {
        panel = p;
        FormatFrame.panel(vista, panel);
        modelo = new DefaultTableModel(null, titulos);
        //obtener lista de reportes ordenados de mas reciente
        Response<Reporte> response = CRUDReporte.getInstance().getAll();
        if (response.isSuccess()) {
            List<Reporte> listaReportes = response.getDataList();
            panel.jtblListaReportes.setModel(modelo);
            for (Reporte reporte : listaReportes) {
                modelo.addRow(new Object[]{
                    reporte.getFeria().getNombre(),
                    reporte.getId(),
                    reporte.getChart().getId(),
                    reporte.getFecha()});
            }
            FormatTable.reportesTable(panel.jtblListaReportes);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
