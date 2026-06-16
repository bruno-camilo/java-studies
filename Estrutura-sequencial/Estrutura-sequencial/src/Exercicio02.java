import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);

        double PI = 3.14159;
        double raio = input.nextDouble();
        double area = PI * Math.pow(raio, 2.0);
        System.out.printf("A=%.4f%n", area);

        input.close();
    }
}
