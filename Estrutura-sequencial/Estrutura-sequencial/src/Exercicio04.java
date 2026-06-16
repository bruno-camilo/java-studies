import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        int numeroFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();
        double salario = (double) horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numeroFuncionario, salario);

        input.close();
    }
}
