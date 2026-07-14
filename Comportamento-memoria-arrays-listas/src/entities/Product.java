package entities;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double calculateAverage (Product[] vector){
        double average = 0.0;

        for (int i = 0; i < vector.length ; i++) {
            average += vector[i].getPrice();
        }

        return  average / vector.length;
    }
}
