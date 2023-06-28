package JavaBasics;

import java.util.Locale;
import java.util.Scanner;

public class VectorHeights {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();

        String vectNames[] = new String[number];
        int vectAges[] = new int[number];
        float vectHeight[] = new float[number];

        for (int i = 0; i < vectHeight.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            vectNames[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectAges[i] = sc.nextInt();
            System.out.print("Altura: ");
            vectHeight[i] = sc.nextFloat();
        }


    }
}
