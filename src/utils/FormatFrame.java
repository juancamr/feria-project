package utils;

import dao.CRUDLocal;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Local;
import vista.WindowMain;

public class FormatFrame {
    public static void window(JFrame vista, int[] dimensions, String title) {
        vista.setSize(dimensions[0], dimensions[1]);
        vista.setTitle(title);
        vista.setLocationRelativeTo(vista);
        vista.setVisible(true);
        vista.setResizable(false);
    }
    
    public static void panel(WindowMain vista, JPanel panel) {
        panel.setSize(900, 900);
        panel.setLocation(0,0);
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
    
    public static void fillComboBoxWithLocals(JComboBox combo) {
        ArrayList<Local> listaLocals = CRUDLocal.getInstance().getAll();
        for (Local local : listaLocals) {
            combo.addItem(local.getNombre());
        }
    }
}
