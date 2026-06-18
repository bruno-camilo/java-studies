import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int maiorNumero = Math.max(numero1, numero2);
        int menorNumero = Math.min(numero1, numero2);

        if (maiorNumero % menorNumero == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multoplos");
        }

        input.close();
    }
}
