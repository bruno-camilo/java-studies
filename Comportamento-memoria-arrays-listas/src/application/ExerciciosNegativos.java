package application;

import java.util.Scanner;

public class ExerciciosNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?" );
        int number = input.nextInt();
        int[] vect = new int[number];

        for (int i = 0; i <number ; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGGATIVOS: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0 )
                System.out.println(vect[i]);
        }


        input.close();
    }
}
