package application;

import entity.Product;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = input.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: "+ product);
        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.printf("Update data: " + product);

        input.close();

    }
}
