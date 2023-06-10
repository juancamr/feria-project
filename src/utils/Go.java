package utils;

import controlador.*;
import vista.*;

public class Go {

    public static void toRegistro() {
        new ControladorRegister(new WindowRegister());
    }

    public static void toLogin() {
        new ControladorLogeo(new WindowLogin());
    }

    public static void toWindowMain() {
        new ControladorWindowMain(new WindowMain());
    }

    public static void toHome(WindowMain vista) {
        new ControladorHome(vista, new PanelHome());
    }

    public static void toRegistroEntradas(WindowMain vista) {
        new ControladorRegistroEntradas(vista, new PanelRegistroEntradas());
    }

    public static void toRegistroFeria(WindowMain vista) {
        new ControladorRegistroFeria(vista, new PanelRegistroFeria());
    }

    public static void toRegistroLocal(WindowMain vista) {
        new ControladorRegistroLocal(vista, new PanelRegistroLocal());
    }

    public static void toRegistroProveedor(WindowMain vista) {
        new ControladorRegistroProveedor(vista, new PanelRegistroProveedor());
    }

    public static void toRegistroPatrocinadores(WindowMain vista) {
        new ControladorRegistroPatrocinador(vista, new PanelRegistroPatrocinador());
    }
}
