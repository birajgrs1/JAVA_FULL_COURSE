package forMyOwnPractice.ArraysInJava.MultidimentionalArrays;

import java.util.Scanner;

public class MultiplyTwoMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row1, col1, row2, col2;


        System.out.println("Enter number of rows for the first matrix: ");
        row1 = sc.nextInt();

        System.out.println("Enter number of columns for the first matrix: ");
        col1 = sc.nextInt();


        System.out.println("Enter number of rows for the second matrix: ");
        row2 = sc.nextInt();

        System.out.println("Enter number of columns for the second matrix: ");
        col2 = sc.nextInt();

        // Check if matrices are compatible for multiplication
        if (col1 != row2) {
            System.out.println("Matrices cannot be multiplied. The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] product = new int[row1][col2];

        // Input for the first matrix
        System.out.println("Enter the first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter the second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Multiply the matrices
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
