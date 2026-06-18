import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        int codigo = input.nextInt();
        int quantidade = input.nextInt();
        double valorTotal = 0.0;

        if( codigo == 1)
            valorTotal = quantidade * 4.0;
        else if(codigo ==  2)
            valorTotal = quantidade * 4.5;
        else if(codigo ==  3)
            valorTotal = quantidade * 5.0;
        else if(codigo ==  4)
            valorTotal = quantidade * 2.0;
        else if(codigo ==  5)
            valorTotal = quantidade * 1.50;

        System.out.printf("Total: R$ %.2f", valorTotal);

        input.close();
    }
}
