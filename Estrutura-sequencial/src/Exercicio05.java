import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        int codigo1 = input.nextInt();
        int pecas1  = input.nextInt();
        double valorUnitario1 = input.nextDouble();
        int codigo2 = input.nextInt();
        int pecas2  = input.nextInt();
        double valorUnitario2 = input.nextDouble();

        double valorAPagar = (valorUnitario1 * pecas1) + (valorUnitario2 * pecas2);
        System.out.printf("Valor a pagar: R$ %.2f%n",valorAPagar);

        input.close();
    }
}
