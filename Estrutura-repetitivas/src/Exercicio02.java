import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0)
                System.out.println("Primeiro");
            else if (x < 0 && y > 0 )
                System.out.println("Segundo");
            else if (x < 0 && y < 0 )
                System.out.println("Terceiro");
            else
                System.out.println("Quarto");

            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
