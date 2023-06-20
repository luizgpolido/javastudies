package JavaBasics;

import java.util.Scanner;

public class PlanoCartesianoV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma coordenada x: ");
        int x = teclado.nextInt();
        System.out.print("Digite uma coordenada y:");
        int y = teclado.nextInt();


        while(x != 0 && y != 0){
            if (x > 0 && y >0){
                System.out.println("Primeiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else {
                System.out.println("Terceiro Quadrante");
            }

            System.out.print("Digite uma coordenada x: ");
            x = teclado.nextInt();
            System.out.print("Digite uma coordenada y:");
            y = teclado.nextInt();


        }

        System.out.println("Coordenada Nula");

    }
}
