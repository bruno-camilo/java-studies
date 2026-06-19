import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            double resultado = 0.0;

            if(y == 0 ){
                System.out.println("divisao impossivel");
            }else {
                resultado = (double) x / y;
                System.out.printf("%.1f", resultado);
            }
        }
        input.close();
    }
}
