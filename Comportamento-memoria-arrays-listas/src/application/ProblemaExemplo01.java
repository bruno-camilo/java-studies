package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero de pessoas: ");
        int numeroPessoas = input.nextInt();
        double[] vector = new double[numeroPessoas];
        double somaDasAlturas = 0.0;
        double mediaDasAlturas = 0.0;

        for (int i = 0; i < numeroPessoas ; i++) {
            System.out.print("Digite a altura da pessoa: ");
            vector[i] = input.nextDouble();
        }

        for (int i = 0; i < numeroPessoas; i++) {
            somaDasAlturas += vector[i];
        }

        mediaDasAlturas = somaDasAlturas / numeroPessoas;
        System.out.printf("Media da altura: %.2f", mediaDasAlturas);
        input.close();
    }
}
