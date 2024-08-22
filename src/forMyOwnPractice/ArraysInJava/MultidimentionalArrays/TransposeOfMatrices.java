package forMyOwnPractice.ArraysInJava.MultidimentionalArrays;

import java.util.Scanner;

public class TransposeOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, col;


        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        col = sc.nextInt();

        int[][] matrix = new int[row][col];
        //  Rows and columns are swapped for the transpose
        int[][] transpose = new int[col][row];

        // Input
        System.out.println("Enter the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
