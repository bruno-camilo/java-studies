package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return String.format("%s, $%.2f, %d units, Total: $ %.2f", name, price, quantity, total());
    }

    public double total(){
        return quantity * price;
    }

    public void addProduct(int quantity){
        if(quantity > 0 )
            this.quantity += quantity;
    }

    public void  removeProduct(int quantity){
        if(quantity > 0 )
            this.quantity -= quantity;
    }
}
