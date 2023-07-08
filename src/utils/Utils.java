package utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils {

    public static String makeSqlDate(Date fecha) {
        return new SimpleDateFormat("yyyy-MM-dd").format(fecha);
    }

    public static String encryptPassword(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 64) {
                hexString.insert(0, '0');
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
            return "";
        }
    }

    public static boolean comparePassword(String enteredPassword, String hashedPassword) {
        return encryptPassword(enteredPassword).equals(hashedPassword);
    }

    public static double calculateSum(List<Double> numbers) {
        return numbers.stream().mapToDouble(Double::doubleValue)
                .sum();
    }
    
    public static String balanceFormat(Double number) {
        return new DecimalFormat("S/ 0.00").format(number);
    }
}
