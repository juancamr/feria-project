package controlador;

import dao.CRUDFeria;
import formato.FormatoRegistrarFeria;
import interfaces.Strings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import modelo.Feria;
import modelo.Response;
import utils.DebugObject;
import utils.Dialog;
import utils.FormatFrame;
import utils.Go;
import vista.PanelRegistroFeria;
import vista.WindowMain;

public class ControladorRegistroFeria implements ActionListener {

    PanelRegistroFeria panel;

    public ControladorRegistroFeria(WindowMain vista, PanelRegistroFeria pan) {
        panel = pan;
        FormatoRegistrarFeria.fillComboBox(panel.jcbxLocal);
        panel.jbtnRegistrar.addActionListener(this);

        Response<Feria> response = CRUDFeria.getInstance().getFeriaToday();
        if (response.isSuccess()) {
            Go.toHome(vista);
            Dialog.message("Actualmente se encuentra administrando la feria " + response.getData().getNombre());
        } else {
            FormatFrame.panel(vista, panel);
        }
        panel.jtxtNombre.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnRegistrar) {
            Feria feria = FormatoRegistrarFeria.makeFeria(panel);
            feria.setId(0);
            feria.setFecha(new Date());
            if (DebugObject.isFilledObject(feria)) {
                Response<Feria> response = CRUDFeria.getInstance().add(feria);
                if (response.isSuccess()) {
                    Dialog.message(response.getMessage());
                    FormatoRegistrarFeria.emptyFields(panel);
                } else {
                    Dialog.message(response.getMessage());
                }
            } else {
                Dialog.message(Strings.PLEASE_FILL_FIELDS);
            }
        }
    }

}
