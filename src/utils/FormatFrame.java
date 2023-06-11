package utils;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
        panel.setLocation(0, 0);
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
}
