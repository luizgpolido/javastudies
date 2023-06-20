package JavaBasics;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor N: ");
        int n = teclado.nextInt();
        int fatorial = 0;
        int resultado = 0;

        for (int i = 1; i <= n ; i++) {
            if (n == 0 || n == 1){
                System.out.println(1);
            } else {
                resultado = n * (n - i);
                fatorial += resultado;
            }
        }
        System.out.println(fatorial);
    }
}
