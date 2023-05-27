
package main.java.utils;

public class Calculo {
    public static double calcularSuma(double[] numeros) {
        double suma = 0;
        for(double numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}
