import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String us=format.format(payment);
        format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india=format.format(payment);
        format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=format.format(payment);
        format.setCurrency(Currency.getInstance(Locale.FRANCE));
        format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=format.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}