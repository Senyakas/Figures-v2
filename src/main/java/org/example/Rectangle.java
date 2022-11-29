package org.example;

public class Rectangle {
    private double a, b;

    public Rectangle(double a, double b) {
        if ( a > 0) this.a = a;
        else throw new RuntimeException("There is no figure with such parameters.");
        if ( b > 0) this.b = b;
        else throw new RuntimeException("There is no figure with such parameters.");
    }

    double Square (){
        return a * b;
    }

    double Perimeter(){
        return 2 * ( a + b);
    }
}