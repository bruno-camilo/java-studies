import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        calculateHigher(number1, number2, number3);
        input.close();
    }
    public static void calculateHigher(int number1, int number2, int number3){
        int higher = number1;
        if (number1 > number2 && number1 > number3){
            higher = number1;
        } else if (number2 > number3) {
            higher = number2;
        }else {
            higher = number3;
        }
        System.out.println("Higher = "+ higher);
    }
}
