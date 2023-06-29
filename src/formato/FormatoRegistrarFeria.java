package formato;

import dao.CRUDLocal;

import java.util.List;
import javax.swing.JComboBox;

import modelo.Feria;
import modelo.Local;
import modelo.Response;
import vista.PanelRegistroFeria;

public class FormatoRegistrarFeria {

    public static void emptyFields(PanelRegistroFeria panel) {
        panel.jtxtNombre.setText("");
        panel.jspnAforo.setValue(0);
        panel.jspnCostoEntrada.setValue(0);
        panel.jspnPrespuesto.setValue(0);
        panel.jtxtSeguridad.setText("");
        panel.jtxtNombre.requestFocus();
    }

    public static Feria makeFeria(PanelRegistroFeria panel) {
        Response<Local> response = CRUDLocal.getInstance().getByName(panel.jcbxLocal.getSelectedItem().toString());
        return new Feria.Builder()
                .setLocal(response.isSuccess() ? response.getData() : null)
                .setNombre(panel.jtxtNombre.getText())
                .setAforo(Integer.parseInt(panel.jspnAforo.getValue().toString()))
                .setCosto(Double.parseDouble(panel.jspnCostoEntrada.getValue().toString()))
                .setSeguridad(panel.jtxtSeguridad.getText())
                .setPresupuesto(Double.parseDouble(panel.jspnPrespuesto.getValue().toString()))
                .build();
    }

    public static void fillComboBox(JComboBox combo, List<Local> listaLocals) {
        for (Local local : listaLocals) {
            combo.addItem(local.getNombre());
        }
    }
}
