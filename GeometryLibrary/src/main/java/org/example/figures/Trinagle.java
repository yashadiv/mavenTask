package org.example.figures;

public class Trinagle {
    private double a;
    private double b;
    private double c;

    public double perimetr(double a, double b, double c){
        this.a = a;
        this.b = b;
        return (a+b+c);
    }

    public double square (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        Trinagle trinagle = new Trinagle();
        double p = trinagle.perimetr(a,b,c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
