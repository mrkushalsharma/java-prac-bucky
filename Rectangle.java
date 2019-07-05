
//Write an object oriented program to find the area and perimeter of rectangle

import java.util.Scanner;

public class Rectangle {
    private double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void calculateArea() {
        double A = length * breadth;
        System.out.println("Area: " + A);
    }

    public void calculatePerimeter() {
        double P = 2 * (length + breadth);
        System.out.println("Perimeter: " + P);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter length: ");
        double l = input.nextDouble();

        System.out.println("enter breadth: ");
        double b = input.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.calculateArea();
        r.calculatePerimeter();

    }
}