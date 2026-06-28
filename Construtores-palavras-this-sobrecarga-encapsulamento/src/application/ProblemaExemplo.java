package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();
        System.out.println();

        Product product = new Product(name, price, quantity);
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of product to be added in stock: ");
        int numberOfProduct = input.nextInt();
        product.addProduct(numberOfProduct);
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of product to be removed from stock: ");
        numberOfProduct = input.nextInt();
        product.removeProduct(numberOfProduct);
        System.out.println("Updated data: "+ product);


        input.close();
    }
}
