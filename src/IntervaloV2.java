import java.util.Scanner;

public class IntervaloV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos números quer verificar: ");
        int quantityCheck = teclado.nextInt();
        int gapIn = 0;
        int gapOut = 0;

        for (int i = 1; i <= quantityCheck ; i++) {
            System.out.println("Digite um número: ");
            int numberGap = teclado.nextInt();

            if (numberGap >= 10 && numberGap <= 20){
                gapIn++;
            } else {
                gapOut++;
            }
        }

        System.out.println("Gap In: " + gapIn + "\nGap Out: " + gapOut);

    }
}
