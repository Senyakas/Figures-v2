package org.example;

public class Circle {
    private double r;

    public Circle(double r) {
        if ( r > 0) this.r = r;
        else throw new RuntimeException("There is no figure with such parameters.");
    }

    double Square (){
        return Math.PI * r * r;
    }

    double Perimeter(){
        return 2 * Math.PI * r;
    }
}