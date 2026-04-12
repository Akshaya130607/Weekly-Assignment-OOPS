

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();

        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid matrix size.");
            System.exit(0);
        }

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input matrix 1
        System.out.println("Enter Matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Input matrix 2
        System.out.println("Enter Matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Output result
        System.out.println("Result Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}