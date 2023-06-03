package utils;

import javax.swing.JFrame;

public class FormatFrame {
    public static void window(JFrame vista, int[] dimensions, String title) {
        vista.setSize(dimensions[0], dimensions[1]);
        vista.setTitle(title);
        vista.setLocationRelativeTo(vista);
        vista.setVisible(true);
        vista.setResizable(false);
    }
}
