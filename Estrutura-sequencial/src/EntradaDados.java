import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        System.out.println("Voce digitou: " + x);

        input.close();
    }
}
