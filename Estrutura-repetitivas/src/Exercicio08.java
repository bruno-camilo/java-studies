import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fatorial = 1;

        for (int i = 0; i < n ; i++) {
            fatorial *= (n - i);
        }
        System.out.println(fatorial);

        input.close();
    }
}
