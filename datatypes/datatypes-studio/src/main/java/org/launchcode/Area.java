package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
//        double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Radius value: ");
        double radius = input.nextInt();
//        double area = pi * radius * radius;
        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
