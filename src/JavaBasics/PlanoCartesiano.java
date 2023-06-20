package JavaBasics;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o seu X: ");
        float x = teclado.nextFloat();
        System.out.println("Escreva o seu Y: ");
        float y = teclado.nextFloat();
        teclado.close();
        
        if (x > 0 && y > 0){
            System.out.println("Seu quadrante é Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Seu quadrante é Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Seu quadrante é Q2 ");
        } else if (x < 0 && y < 0) {
            System.out.println("Seu quadrante é Q3");
        } else if (x == 0 && y != 0) {
            System.out.println("Eixo X");
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }

    }
}
