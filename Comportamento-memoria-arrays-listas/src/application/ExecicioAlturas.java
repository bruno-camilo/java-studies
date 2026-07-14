package application;

import java.util.Locale;
import java.util.Scanner;

public class ExecicioAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int number = input.nextInt();
        String[] nomes = new String[number];
        int[] idades = new int[number];

        double[] altura = new double[number];
        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Dados " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            input.nextLine();
            nomes[i] = input.nextLine();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            System.out.print("Altura: ");
            altura[i] = input.nextDouble();
        }

        for (int i = 0; i < altura.length; i++) {
            sum += altura[i];
        }

        double avg = sum / altura.length;
        System.out.printf("Altura media: %.2f%n", avg);


        for (int i = 0; i < idades.length; i++) {
            if(idades[i] < 16)
                count ++;
        }
        double percent = count * 100.0 /number;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                count++;
                System.out.println(nomes[i]);
            }
        }

        input.close();
    }
}
