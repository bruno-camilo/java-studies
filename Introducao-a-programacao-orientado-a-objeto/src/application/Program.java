package application;

import entity.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double x3 = input.nextDouble();
        System.out.println("Enter the measure of triangle Y:");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double y3 = input.nextDouble();

        Triangle triangleX = new Triangle(x1, x2, x3);
        double areaX = triangleX.calculateArea();

        Triangle triangleY = new Triangle(y1, y2, y3);
        double areaY = triangleY.calculateArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY )
            System.out.println("Larger area: X");
        else
            System.out.println("Larger area: Y");
        input.close();
    }
}
