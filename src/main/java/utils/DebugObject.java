
package main.java.utils;
import java.lang.reflect.Field;

public class DebugObject {
    
    public static <T> void printObject(T objeto) {
        Field[] fields = objeto.getClass().getDeclaredFields();
        String response = "\n\n"
                + "-------------------------\n"
                + "Debug Object by JC\n"
                + "Atributos:\n";
        for (Field field: fields) {
            field.setAccessible(true);
            Object valorAtributo;
            try {
                valorAtributo = field.get(objeto);
            } catch (IllegalAccessException e) {
                valorAtributo = null;
                System.out.println(e);
            }
            response += field.getName() + " = " + valorAtributo + "\n";
        }
        response += "----------------------------------";
        System.out.println(response);
    }
}