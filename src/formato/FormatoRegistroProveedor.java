package formato;

import dao.CRUDFeria;
import modelo.Proveedor;
import vista.PanelRegistroProveedor;

public class FormatoRegistroProveedor {

    public static Proveedor makeProveedor(PanelRegistroProveedor panel) {
        Proveedor proveedor = new Proveedor();
        proveedor.setNombre(panel.jtxtNombre.getText());
        proveedor.setDescripcion(panel.jtxtDescripcion.getText());
        proveedor.setFeria(CRUDFeria.getInstance().getByName(panel.jcbxFeria.getSelectedItem().toString()));
        return proveedor;
    }
}
