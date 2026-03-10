// Level 3 - Problem 1
// Program Name: PrimeNumberChecker
// Description: Checks if a number is prime using loops and boolean flag

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int divisor = 2; divisor <= number / 2; divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("It is a Prime Number.");
        } else {
            System.out.println("It is not a Prime Number.");
        }

        input.close();
    }
}