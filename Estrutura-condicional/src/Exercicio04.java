import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int inicio = input.nextInt();
        int fim = input.nextInt();
        int duracao = 0;

        if (inicio >= fim)
            duracao = 24 - inicio  + fim ;
        else
            duracao = fim - inicio;


        System.out.printf("O JOGO DUROU %d HORAS", duracao);

        input.close();
    }
}
