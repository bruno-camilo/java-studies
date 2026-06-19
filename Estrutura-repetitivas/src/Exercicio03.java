import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int produto = input.nextInt();
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while(produto != 4) {
            if(produto < 1 || produto > 4) {
                produto = input.nextInt();
            }else {
                switch (produto) {
                    case 1 -> alcool++;
                    case 2 -> gasolina++;
                    case 3 -> diesel++;
                }
                produto = input.nextInt();
            }

        }

        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        input.close();
    }
}
