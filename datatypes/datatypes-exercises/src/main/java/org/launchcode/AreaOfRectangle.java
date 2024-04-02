package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main (String[] args) {
    Scanner rectangleLength = new Scanner(System.in);
    System.out.println("Please enter a value for the length of a rectangle: ");
    int length = rectangleLength.nextInt();

    Scanner rectangleWidth = new Scanner(System.in);
    System.out.println("Please enter a value for the width of a rectangle: ");
    int width = rectangleWidth.nextInt();

    int area = length * width;

    rectangleLength.close();
    rectangleWidth.close();

    System.out.println("The area of the rectangle is " + area);
    }

}
