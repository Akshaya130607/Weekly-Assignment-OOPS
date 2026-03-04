// Level 2 - Problem 1
// Program Name: AverageMarksCalculator
// Description: Calculate average of 3 subjects

import java.util.Scanner;

public class AverageMarksCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        double subject1 = input.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double subject2 = input.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double subject3 = input.nextDouble();

        double totalMarks = subject1 + subject2 + subject3;
        double averageMarks = totalMarks / 3;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        input.close();
    }
}