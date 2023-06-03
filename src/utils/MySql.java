
package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MySql {
    public static String makeDate(Date fecha) {
        return new SimpleDateFormat("yyyy-MM-dd").format(fecha);
    }
}
