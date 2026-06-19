import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int in = 0;
        int out = 0;
        int x = 0;

        for (int i = 0; i < n ; i++) {
            if (x >= 10 && x <= 20)
                in++;
            else
                out++;

            x = input.nextInt();
        }
        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);

        input.close();
    }
}
