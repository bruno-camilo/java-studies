package entity;

public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangle(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calculateArea(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p *(p -ladoA) * (p - ladoB) * (p - ladoC));
    }
}
