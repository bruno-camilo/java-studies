package application;

import entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        student.name = input.nextLine();
        student.testScore1 = input.nextDouble();
        student.testScore2 = input.nextDouble();
        student.testScore3 = input.nextDouble();

        System.out.println(student.calculateApproval());


        input.close();
    }
}
