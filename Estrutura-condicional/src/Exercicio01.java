import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if(numero >= 0 ){
            System.out.println("POSITIVO");
        }else {
            System.out.println("NEGATIVO");
        }

        input.close();
    }
}
