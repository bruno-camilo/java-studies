import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double media = 0.0;

        for (int i = 0; i < n ; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            media = ((x * 2) + (y * 3) + (z * 5)) / 10;
            System.out.printf("%.1f",media);
        }

        input.close();
    }
}
