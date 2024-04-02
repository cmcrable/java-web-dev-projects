package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner miles = new Scanner(System.in);
        Scanner fuel = new Scanner(System.in);

        System.out.println("Please enter number of miles driven:");
        double totalMiles = miles.nextDouble();

        System.out.println("Please enter amount of gas consumed in gallons:");
        double totalFuel = fuel.nextDouble();

        double mpg = totalMiles / totalFuel;

        miles.close();
        fuel.close();

        System.out.println("Your total miles per gallon is " + mpg);
    }
}
