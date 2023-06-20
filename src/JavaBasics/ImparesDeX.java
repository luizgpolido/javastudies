package JavaBasics;

import java.util.Scanner;

public class ImparesDeX {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um valor de X >= 1 e <= 1000: ");
        int x = teclado.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        teclado.close();
    }
}
