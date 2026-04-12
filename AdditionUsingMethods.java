
import java.util.Scanner;

public class AdditionUsingMethods {

    // Method to add two numbers
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double result = addNumbers(number1, number2);

        System.out.println("Sum: " + result);

        input.close();
    }
}
