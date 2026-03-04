// Level 1 - Problem 2
// Program Name: SimpleInterestCalculator
// Description: Calculate simple interest

import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);

        input.close();
    }
}