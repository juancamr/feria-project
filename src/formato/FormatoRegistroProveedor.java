package formato;

import dao.CRUDFeria;
import modelo.Feria;
import modelo.Proveedor;
import modelo.Response;
import vista.PanelRegistroProveedor;

public class FormatoRegistroProveedor {

    public static Proveedor makeProveedor(PanelRegistroProveedor panel) {
        Proveedor proveedor = new Proveedor.Builder()
        .setNombre(panel.jtxtNombre.getText())
        .setDescripcion(panel.jtxtDescripcion.getText())
        .setCosto(Double.parseDouble(panel.jtxtCosto.getText())).build();
        Response<Feria> response = CRUDFeria.getInstance().getByName(panel.jcbxFeria.getSelectedItem().toString());
        proveedor.setFeria(response.isSuccess() ? response.getData() : null);
        return proveedor;
    }

    public static void emptyFields(PanelRegistroProveedor panel) {
        panel.jtxtNombre.setText("");
        panel.jtxtDescripcion.setText("");
        panel.jcbxFeria.setSelectedIndex(0);
        panel.jtxtNombre.requestFocus();
    }

    public static void fillComboBox(PanelRegistroProveedor panel) {
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
