// Level 1 - Problem 1
// Program Name: VotingEligibilityChecker
// Description: Checks if a person is eligible to vote using if-else and boolean

import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Boolean Expression
        boolean isEligible = age >= 18;

        // Conditional Check
        if (isEligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}