package utils;

import javax.swing.JOptionPane;

public class Dialog {

    public static void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean confirm(String message) {
        int option = JOptionPane.showConfirmDialog(null, message);
        return option == JOptionPane.YES_OPTION;
    }
}
