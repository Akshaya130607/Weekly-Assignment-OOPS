// Level 1 - Problem 1
// Program Name: RectangleAreaCalculator
// Description: Calculate area and perimeter of a rectangle using user input

import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Inputs
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Output
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}