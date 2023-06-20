package JavaBasics;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos números quer dividir :");
        int quantity = teclado.nextInt();

        for (int i = 1; i <= quantity ; i++) {
            System.out.println("Digite o seu numerador: ");
            float numerador = teclado.nextFloat();
            System.out.println("Digite o seu denominador: ");
            float denominador = teclado.nextFloat();

            if (denominador == 0){
                System.out.println("Divisão Impossível ");
            } else {
                float resultado =  numerador / denominador;
                System.out.println(resultado);
            }

        teclado.close();

        }
    }
}
