import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = number1 + number2;

        System.out.printf("SOMA = %d", result);

        input.close();
    }
}
