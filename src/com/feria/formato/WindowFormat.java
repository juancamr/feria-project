package com.feria.formato;

import com.feria.vista.Window;

public class WindowFormat {
    public static void Presentacion(Window window) {
        window.setSize(1100, 900);
        window.setTitle("Feria");
        window.setLocationRelativeTo(window);
        window.setVisible(true);
        window.setResizable(false);
    }
}
