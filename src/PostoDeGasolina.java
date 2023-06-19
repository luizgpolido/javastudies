import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("   Seja Bem-Vindo   ");
        System.out.println("===================");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel ");
        System.out.println("4 - Fim");
        System.out.println("===================");
        int opcao = teclado.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (opcao != 4){
            if (opcao < 1 || opcao > 4){
                System.out.println("Opção Inválida");
            } else if (opcao == 1) {
                alcool++;
            } else if (opcao == 2) {
                gasolina++;
            } else if (opcao == 3) {
                diesel++;
            }

            System.out.println("===================");
            System.out.println("1 - Álcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel ");
            System.out.println("4 - Fim");
            System.out.println("===================");
            opcao = teclado.nextInt();

        }

        System.out.println("Obrigado!");
        System.out.printf("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
}
