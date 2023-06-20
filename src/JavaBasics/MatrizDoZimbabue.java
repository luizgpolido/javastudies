package JavaBasics;

import java.util.Scanner;

public class MatrizDoZimbabue {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n ; i++) {
            int first = i;
            int second = i*i;
            int third = i*i*i;
            System.out.printf("%d %d %d %n" , first , second , third);
        }
    }
}
