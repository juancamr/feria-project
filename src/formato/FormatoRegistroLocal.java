
package formato;

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
