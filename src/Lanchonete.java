import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("1 - Cachorro Quente  || R$ 4.00");
        System.out.println("2 - X-Salada         || R$ 4.50");
        System.out.println("3 - X-Bacon          || R$ 5.00");
        System.out.println("4 - Torrada simples  || R$ 2.00");
        System.out.println("5 - Refrigerante     || R$ 1.50");
        System.out.println("===============================");

        System.out.println("Qual será o seu pedido?");
        byte foodChoice = Byte.valueOf(teclado.nextLine());
        System.out.println("Quantas unidades?");
        byte quantityChoice = Byte.valueOf(teclado.nextLine());

        switch (foodChoice){
            case 1:

                System.out.println("O preço foi de R$ " + (quantityChoice * 4));
                break;
            case 2:
                System.out.println("O preço foi de R$ " + (quantityChoice * 4.5));
                break;
            case 3:
                System.out.println("O preço foi de R$ " + (quantityChoice * 5));
                break;
            case 4:
                System.out.println("O preço foi de R$ " + (quantityChoice * 2));
                break;
            case 5:
                System.out.println("O preço foi de R$ " + (quantityChoice * 1.5));
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}