// Level 2 - Problem 1
// Program Name: LoginValidator
// Description: Uses logical operators and boolean expressions

import java.util.Scanner;

public class LoginValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Fixed credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        // User input
        System.out.print("Enter username: ");
        String enteredUsername = input.next();

        System.out.print("Enter password: ");
        String enteredPassword = input.next();

        // Boolean Expressions with logical AND
        boolean isLoginValid = enteredUsername.equals(correctUsername)
                && enteredPassword.equals(correctPassword);

        if (isLoginValid) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        input.close();
    }
}