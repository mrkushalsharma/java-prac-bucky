
//Write an object oriented program in Java to find area of circle.

import java.util.Scanner;

public class area {
    private double radius;

    area(double x) {
        radius = x;
    }

    public double calculateArea() {
        double A = 3.14 * radius * radius;
        return A;
    }

    public static void main(String[] args) {

        double Area;

        Scanner input = new Scanner(System.in);
        System.out.println("enter radius: ");
        double r = input.nextDouble();

        area a = new area(r);
        Area = a.calculateArea();
        System.out.println("Area: " + Area);
    }
}