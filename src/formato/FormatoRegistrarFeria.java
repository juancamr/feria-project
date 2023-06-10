
package formato;

import dao.CRUDLocal;
import modelo.Feria;
import vista.PanelRegistroFeria;

public class FormatoRegistrarFeria {
    public static void emptyFields(PanelRegistroFeria panel) {
        panel.jtxtNombre.setText("");
        panel.jspnAforo.setValue(0);
        panel.jspnCostoEntrada.setValue(0);
        panel.jspnPrespuesto.setValue(0);
        panel.jtxtSeguridad.setText("");
        panel.jtxtNombre.requestFocus();
    }
    
    public static Feria makeFeria(PanelRegistroFeria panel) {
        Feria feria = new Feria();
        feria.setLocal(CRUDLocal.getInstance().getByName(panel.jcbxLocal.getSelectedItem().toString()));
        feria.setNombre(panel.jtxtNombre.getText());
        feria.setAforo(Integer.parseInt(panel.jspnAforo.getValue().toString()));
        feria.setCosto(Double.parseDouble(panel.jspnCostoEntrada.getValue().toString()));
        feria.setFecha(panel.jdchFecha.getDate());
        feria.setSeguridad(panel.jtxtSeguridad.getText());
        feria.setPresupuesto(Double.parseDouble(panel.jspnPrespuesto.getValue().toString()));
        return feria;
    }
}
