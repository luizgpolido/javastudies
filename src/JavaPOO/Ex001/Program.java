package JavaPOO.Ex001;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = teclado.nextLine();
        System.out.print("Price: ");
        double price = teclado.nextDouble();
        Product product = new Product(name, price);

        // System.out.print(product.name + "," + product.price + "," + product.quantity);
        // Usar o método toString();

        System.out.println("Product Data:" + product);

        System.out.println("\nEnter the number of products to be added in the stock: ");
        int quantity = teclado.nextInt();
        product.addProducts(quantity);

        System.out.println("\nProduct Data:" + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = teclado.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nProduct Data:" + product);


        teclado.close();

    }

}
