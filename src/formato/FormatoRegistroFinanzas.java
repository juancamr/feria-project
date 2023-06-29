package formato;

import dao.CRUDFeria;
import modelo.Feria;
import modelo.Response;
import vista.PanelFinanzas;

public class FormatoRegistroFinanzas {

    public static boolean isAllFieldsFilled(PanelFinanzas panel) {
        return !((int) panel.spnGastos.getValue() == 0) || !((int) panel.spnIngresos.getValue() == 0);
    }
    
    public static void emptyFields(PanelFinanzas panel) {
        panel.spnGastos.setValue(0);
        panel.spnIngresos.setValue(0);
        panel.spnGastos.requestFocus();
    }
}
