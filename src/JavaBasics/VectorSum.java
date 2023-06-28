package JavaBasics;

import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much numbers you will insert? ");
        int numbers = sc.nextInt();
        double average = 0;
        double sum = 0;

        double vect[] = new double[numbers];

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Insert number: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Values: ");
        for (int i = 0; i < vect.length ; i++) {
            System.out.print(vect[i] + " ");
        }

        for (int i = 0; i < vect.length ; i++) {
            sum += vect[i];
        }

        average = sum / vect.length;

        System.out.printf("\nSum: %.2f%n" , sum);
        System.out.printf("Average: %.2f%n" , average);
    }
}
