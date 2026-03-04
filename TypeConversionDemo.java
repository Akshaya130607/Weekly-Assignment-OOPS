// Level 2 - Problem 2
// Program Name: TypeConversionDemo
// Description: Demonstrates implicit and explicit type conversion

import java.util.Scanner;

public class TypeConversionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int integerValue = input.nextInt();

        // Implicit conversion (int to double)
        double implicitConversion = integerValue;

        // Explicit conversion (double to int)
        double decimalNumber = 45.78;
        int explicitConversion = (int) decimalNumber;

        System.out.println("Implicit Conversion (int to double): " + implicitConversion);
        System.out.println("Explicit Conversion (double to int): " + explicitConversion);

        input.close();
    }
}