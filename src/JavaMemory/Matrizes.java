package JavaMemory;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira quantas linhas você deseja na Matriz: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0){
                    counter++;
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers: " + counter);
        System.out.println("Complete Matriz");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
