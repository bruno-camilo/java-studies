package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetore {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Product[] products = new Product[number];

        for (int i = 0; i < number ; i++) {
            String name = input.next();
            double price = input.nextDouble();
            products[i] = (new Product(name, price));
        }

        double sum = 0.0;
        for (int i = 0; i < products.length ; i++) {
            sum += products[i].getPrice();
        }

        double avg =  sum / products.length;
        System.out.printf("Average price = %.2f", avg);


    }
}
