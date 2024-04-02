package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
//        double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Radius value: ");
        double radius = input.nextDouble();
//        double area = pi * radius * radius;
        double area = Circle.getArea(radius);

            while (radius < 0) {
                System.out.println("Cannot process a negative number. Please try again.");
                System.out.println("Please enter a Radius value: ");
                radius = input.nextDouble();
            }
            System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
