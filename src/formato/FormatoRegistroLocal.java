
package formato;

import dao.CRUDLocal;
import java.util.List;
import javax.swing.JComboBox;
import modelo.Local;
import modelo.Response;
import vista.PanelRegistroLocal;

public class FormatoRegistroLocal {
    public static void emptyFields(PanelRegistroLocal panel) {
        panel.jspnAforo.setValue(0);
        panel.jspnCosto.setValue(0);
        panel.jtxtDistrito.setText("");
        panel.jtxtNombre.setText("");
        panel.jtxtNombre.requestFocus();
    }
    

}
