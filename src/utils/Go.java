
package utils;
import controlador.*;
import vista.*;

public class Go {
    public static void toRegistro() {
        new ControladorRegistro(new WindowRegister());
    }
    
    public static void toLogin() {
        new ControladorLogeo(new WindowLogin());
    }
    
    public static void toHome() {
        new ControladorMain(new WindowMain());
    }
}
