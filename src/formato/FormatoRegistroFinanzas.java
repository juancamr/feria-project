
package formato;

import dao.CRUDFeria;
import modelo.Feria;
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
}
