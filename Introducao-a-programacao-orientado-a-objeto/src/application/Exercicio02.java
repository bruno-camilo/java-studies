package application;

import entity.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println("Employe: " + employee );

        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Updated data: " + employee);



        input.close();
    }
}
