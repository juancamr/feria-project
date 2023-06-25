package formato;

import dao.CRUDFeria;
import modelo.Feria;
import modelo.Finanza;
import modelo.Response;
import vista.PanelFinanzas;

public class FormatoRegistroFinanzas {

    public static void fillComboBox(PanelFinanzas panel) {
        Response<Feria> response = CRUDFeria.getInstance().getAll();
        if (response.isSuccess()) {
            for (Feria feria : response.getDataList()) {
                panel.jcbxFeria.addItem(feria.getNombre());
            }
        } else {
            System.out.println(response.getMessage());
        }
    }

    public static Finanza makeFinanza(PanelFinanzas panel) {
        Finanza finanza = new Finanza();
        Response<Feria> response = CRUDFeria.getInstance().getByName(panel.jcbxFeria.getSelectedItem().toString());
        finanza.setFeria(response.getData());
        finanza.setGastos(Double.parseDouble(panel.spnGastos.getValue().toString()));
        finanza.setIngresos(Double.parseDouble(panel.spnIngresos.getValue().toString()));
        return finanza;
    }

    public static boolean isAllFieldsFilled(PanelFinanzas panel) {
        return !((int) panel.spnGastos.getValue() == 0) || !((int) panel.spnIngresos.getValue() == 0);
    }
    
    public static void emptyFields(PanelFinanzas panel) {
        panel.spnGastos.setValue(0);
        panel.spnIngresos.setValue(0);
        panel.jcbxFeria.setSelectedIndex(0);
        panel.spnGastos.requestFocus();
    }
}
