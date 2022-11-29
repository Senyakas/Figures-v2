package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(r1.Square() + " " + r1.Perimeter());
        Rectangle r2 = new Rectangle(-5, 4);
        System.out.println(r2.Square() + " " + r2.Perimeter());

        Circle c1 = new Circle(3);
        System.out.println(c1.Perimeter() + " " + c1.Square());
        Circle c2 = new Circle(-3);
        System.out.println(c2.Perimeter() + " " + c2.Square());

        Triangle t1 = new Triangle(5, 6, 7);
        System.out.println(t1.Perimetr() + " " + t1.Square());
        Triangle t2 = new Triangle(-1, 1, 1);
        System.out.println(t2.Perimetr() + " " + t2.Square());
        Triangle t3 = new Triangle(5, 6, 100);
        System.out.println(t3.Perimetr() + " " + t3.Square());
    }
}