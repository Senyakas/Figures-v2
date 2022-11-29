package org.example;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if ( (a + b <= c) || (a + c <= b) || (b + c <= a))
            throw new RuntimeException("There is no figure with such parameters.");
        if ( a > 0) this.a = a;
        else throw new RuntimeException("There is no figure with such parameters.");
        if ( b > 0) this.b = b;
        else throw new RuntimeException("There is no figure with such parameters.");
        if ( c > 0) this.c = c;
        else throw new RuntimeException("There is no figure with such parameters.");
    }

    double Square () {
        double HalfPerimetr = (a + b + c) / 2;
        return Math.sqrt( HalfPerimetr * ( HalfPerimetr - a) * ( HalfPerimetr - b) * ( HalfPerimetr - c));
    }

    double Perimetr () {
        return a + b + c;
    }
}