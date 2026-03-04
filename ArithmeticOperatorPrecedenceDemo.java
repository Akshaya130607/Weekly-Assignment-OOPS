// Level 3 - Problem 1
// Program Name: ArithmeticOperatorPrecedenceDemo
// Description: Demonstrates arithmetic operators and precedence

import java.util.Scanner;

public class ArithmeticOperatorPrecedenceDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter third number: ");
        double thirdNumber = input.nextDouble();

        double resultWithoutParentheses = firstNumber + secondNumber * thirdNumber;
        double resultWithParentheses = (firstNumber + secondNumber) * thirdNumber;

        System.out.println("Result without parentheses: " + resultWithoutParentheses);
        System.out.println("Result with parentheses: " + resultWithParentheses);

        input.close();
    }
}