import java.util.Scanner;

public class CalculadoraDeImposto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário em R$: ");
        double salario = Double.valueOf(teclado.nextLine());
        double imposto = 0.0;
        teclado.close();

        if(salario <=2000){
            imposto = 0.0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0){
            System.out.println("Isento");
        } else {
            System.out.printf("Imposto: R$ %.2f " , imposto);
        }
    }
}
 