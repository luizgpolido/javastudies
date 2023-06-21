package JavaPOO.Ex005;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dolarQuantity = sc.nextDouble();
        System.out.printf("Amount to be paid in Reais: %.2f%n" , CurrencyConverter.dolarInReal());

        sc.close();

    }
}
