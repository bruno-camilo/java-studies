package application;

import entities.Account;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input = new Scanner(System.in);
        double amount = 0.0;
        double depositAmount = 0.0;
        Account account;
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter account holder: ");
        String holder = input.next();
        input.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char depositInitial = input.nextLine().charAt(0);

        if(depositInitial == 'y') {
            System.out.print("Enter initial deposit value: ");
            amount = input.nextDouble();
            account = new Account(accountNumber, holder, amount);
        } else {
            account = new Account(accountNumber, holder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Update account data: ");
        System.out.print(account);


        System.out.print("Enter a witdraw value: ");
        depositAmount = input.nextDouble();
        account.withDrawal(depositAmount);

        System.out.println("Update account data: ");
        System.out.print(account);



        input.close();
    }
}
