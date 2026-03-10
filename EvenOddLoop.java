// Level 1 - Problem 3
// Program Name: EvenOddLoop
// Description: Prints even numbers using for loop and continue

import java.util.Scanner;

public class EvenOddLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter limit: ");
        int limit = input.nextInt();

        // Loop
        for (int number = 1; number <= limit; number++) {

            // Skip odd numbers
            if (number % 2 != 0) {
                continue;
            }

            System.out.println("Even Number: " + number);
        }

        input.close();
    }
}