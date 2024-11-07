package org.example.figures;

public class Rectangle {
    private double a;
    private double b;

    public double perimetr(double a, double b){
        this.a = a;
        this.b = b;
        return (a+b)*2;
    }

    public double square (double a, double b){
        this.a = a;
        this.b = b;
        return a*b;
    }
}
