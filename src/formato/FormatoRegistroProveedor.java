package formato;

import dao.CRUDFeria;
import java.util.ArrayList;
import modelo.Feria;
import modelo.Proveedor;
import vista.PanelRegistroProveedor;

public class FormatoRegistroProveedor {

    public static Proveedor makeProveedor(PanelRegistroProveedor panel) {
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre(panel.jtxtNombre.getText());
        proveedor.setDescripcion(panel.jtxtDescripcion.getText());
        proveedor.setCosto(Double.parseDouble(panel.jtxtCosto.getText()));
        proveedor.setFeria(CRUDFeria.getInstance().getByName(panel.jcbxFeria.getSelectedItem().toString()));
        return proveedor;
    }
    
    public static void emptyFields(PanelRegistroProveedor panel) {
        panel.jtxtNombre.setText("");
        panel.jtxtDescripcion.setText("");
        panel.jcbxFeria.setSelectedIndex(0);
        panel.jtxtNombre.requestFocus();
    }
    
    public static void fillComboBox(PanelRegistroProveedor panel) {
        ArrayList<Feria> listaFeria = CRUDFeria.getInstance().getAll();
        for (Feria feria : listaFeria) {
            panel.jcbxFeria.addItem(feria.getNombre());
        }
    }
}
