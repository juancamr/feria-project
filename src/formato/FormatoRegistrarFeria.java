
package formato;

import dao.CRUDLocal;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Feria;
import modelo.Local;
import vista.PanelRegistroFeria;

public class FormatoRegistrarFeria {
    public static void emptyFields(PanelRegistroFeria panel) {
        panel.jtxtNombre.setText("");
        panel.jtxtAforo.setText("");
        panel.jtxtCostoEntrada.setText("");
        panel.jtxtPresupuesto.setText("");
        panel.jtxtSeguridad.setText("");
        panel.jtxtNombre.requestFocus();
    }
    
    public static Feria makeFeria(PanelRegistroFeria panel) {
        Feria feria = new Feria();
        feria.setLocal(CRUDLocal.getInstance().getByName(panel.jcbxLocal.getSelectedItem().toString()));
        feria.setNombre(panel.jtxtNombre.getText());
        feria.setAforo(Integer.parseInt(panel.jtxtAforo.getText()));
        feria.setCosto(Double.parseDouble(panel.jtxtCostoEntrada.getText()));
        feria.setFecha(panel.jdchFecha.getDate());
        feria.setSeguridad(panel.jtxtSeguridad.getText());
        feria.setPresupuesto(Double.parseDouble(panel.jtxtPresupuesto.getText()));
        return feria;
    }
}
