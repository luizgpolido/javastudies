package JavaBasics;

import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a senha: ");
        int password = teclado.nextInt();

        while (password != 2002){
            System.out.println("Senha inválida");
            System.out.print("Tente novamente: ");
            password = teclado.nextInt();
        }

        System.out.println("Acesso Permitido");
    }
}
