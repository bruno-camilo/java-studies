import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        input.close();
    }
}
