import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf(" %d %d %d%n" ,i , (int)Math.pow(i , 2), (int)Math.pow(i , 3));
        }

        input.close();
    }
}
