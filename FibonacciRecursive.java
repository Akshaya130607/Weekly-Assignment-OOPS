

import java.util.Scanner;

public class FibonacciRecursive {

    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }
}
