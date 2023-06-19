import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos números quer escrever: ");
        int quantity = teclado.nextInt();

        for (int i = 1; i <= quantity ; i++) {
            System.out.print("Digite o primeiro número: ");
            float numberOne = teclado.nextFloat();
            System.out.print("Digite o segundo número: ");
            float numberTwo = teclado.nextFloat();
            System.out.print("Digite o terceiro número: ");
            float numberThree = teclado.nextFloat();

            float media = (numberOne * 2 + numberTwo * 3 + numberThree * 5) / 10;

            System.out.printf("%.1f%n" , media);


        }

    }
}
