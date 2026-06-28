package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double deposit){
        this.number = number;
        this.holder = holder;
        if(deposit > 0)
            this.balance += deposit;
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount){
        if(amount > 0 )
            this.balance += amount;
    }

    public void withDrawal(double amount) {
        if (amount < balance) {
            this.balance -= amount + 5.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Account  %d , Holder: %s, Balance $ %.2f%n", number, holder, balance);
    }
}
