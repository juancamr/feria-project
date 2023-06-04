package utils;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormatFrame {
    public static void window(JFrame vista, int[] dimensions, String title) {
        vista.setSize(dimensions[0], dimensions[1]);
        vista.setTitle(title);
        vista.setLocationRelativeTo(vista);
        vista.setVisible(true);
        vista.setResizable(false);
    }
    
    public static void panel(JFrame vista, JPanel panel) {
        panel.setSize(840, 790);
        panel.setLocation(0,0);
//        vista.content.removeAll();
    }
}
