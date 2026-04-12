

import java.util.Scanner;

public class SearchElementInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {5, 10, 15, 20, 25};

        System.out.print("Enter number to search: ");
        int searchValue = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.err.println("Element not found.");
        }

        input.close();
    }
}
