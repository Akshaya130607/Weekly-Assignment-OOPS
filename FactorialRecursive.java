

import java.util.Scanner;

public class FactorialRecursive {

    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        long result = factorial(num);

        System.out.println("Factorial: " + result);

        input.close();
    }
}