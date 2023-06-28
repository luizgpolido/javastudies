package JavaBasics;

import java.util.Locale;
import java.util.Scanner;

public class VetoresNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How much numbers you will insert? ");
        int numbers = sc.nextInt();

        int vect[] = new int[numbers];

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Insert number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative Numbers");

        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }
}
