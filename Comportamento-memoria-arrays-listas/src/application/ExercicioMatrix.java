package application;

import java.util.Scanner;

public class ExercicioMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        Integer[][] mat = new Integer[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = input.nextInt();
            }
        }

        int numero = input.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numero) {
                    System.out.println("Position " + i + "," + j);
                    // Esquerda
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    // Direita
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    // Acima
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    // Abaixo
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
        input.close();
    }
}

