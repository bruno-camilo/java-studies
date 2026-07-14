package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);

        System.out.print("How many employees will be registed? ");
        int numberEmployee = input.nextInt();
        List<Employee> employees = new ArrayList();

        for (int i = 0; i < numberEmployee; i++) {
            System.out.println();
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");
            Integer id = input.nextInt();
            System.out.print("Name: ");
            String name = input.next();
            input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary incrase: ");
        int id = input.nextInt();
        System.out.print("Enter a percentage: ");
        Double percentage = input.nextDouble();

        for (Employee e : employees){
            if(e.getId().equals(id))
                e.increase(percentage);
        }

        System.out.println();
        System.out.println("List of Employees:");
        for (Employee e : employees){
            System.out.println(e);
        }
        input.close();
    }
}
