

import java.util.Scanner;

public class ArraySumCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        // Validation
        if (size <= 0) {
            System.err.println("Invalid size. Exiting program.");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of elements: " + sum);

        input.close();
    }
}
