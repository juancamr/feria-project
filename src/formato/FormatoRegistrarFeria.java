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
        Feria feria = new Feria();
        Response<Local> response = CRUDLocal.getInstance().getByName(panel.jcbxLocal.getSelectedItem().toString());
        feria.setLocal(response.isSuccess() ? response.getData() : null);
        feria.setNombre(panel.jtxtNombre.getText());
        feria.setAforo(Integer.parseInt(panel.jspnAforo.getValue().toString()));
        feria.setCosto(Double.parseDouble(panel.jspnCostoEntrada.getValue().toString()));
        feria.setSeguridad(panel.jtxtSeguridad.getText());
        feria.setPresupuesto(Double.parseDouble(panel.jspnPrespuesto.getValue().toString()));
        return feria;
    }
    
    public static void fillComboBox(JComboBox combo) {
        Response<Local> response = CRUDLocal.getInstance().getAll();
        if (response.isSuccess()) {
            List<Local> listaLocals = response.getDataList();
            for (Local local : listaLocals) {
                combo.addItem(local.getNombre());
            }
        } else {
            System.out.println(response.getMessage());
        }
    }
}
