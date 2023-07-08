package formato;

import dao.CRUDFeria;
import modelo.Feria;
import modelo.Response;
import vista.PanelFinanzas;

public class FormatoFinanzas {

    public static boolean isAllFieldsFilled(PanelFinanzas panel) {
        return !((int) panel.spnGastos.getValue() == 0) || !((int) panel.spnIngresos.getValue() == 0);
    }
    
    public static void emptyGastoFields(PanelFinanzas panel) {
        panel.jtxtDetalleGasto.setText("");
        panel.spnGastos.setValue(0);
        panel.jtxtDetalleGasto.requestFocus();
    }
    
    public static void emptyIngresoFields(PanelFinanzas panel) {
        panel.jtxtDetalleIngreso.setText("");
        panel.spnIngresos.setValue(0);
        panel.jtxtDetalleIngreso.requestFocus();
    }
}
