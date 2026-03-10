// Level 1 - Problem 2
// Program Name: GradeCalculator
// Description: Determines grade using if-else if ladder

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter marks: ");
        double marks = input.nextDouble();

        // Conditional Statements
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}