package JavaMemory;

import java.util.Scanner;

public class MatrizesBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number of lines: ");
        int lines = sc.nextInt();
        System.out.print("Insert the number of columns: ");
        int columns = sc.nextInt();
        
        int[][] matriz = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Which number do you want? ");
        int number = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == number){
                    System.out.println("Position " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (i < matriz[i].length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}
