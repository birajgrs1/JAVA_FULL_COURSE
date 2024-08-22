package forMyOwnPractice.ArraysInJava.MultidimentionalArrays;
import java.util.Scanner;
public class CheckMetricesAreIdenticalOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row, col;


        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        // Input for the first matrix
        System.out.println("Enter the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Check if the matrices are identical
        boolean identical = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    identical = false;
                    break;
                }
            }
            if (!identical) {
                break;
            }
        }


        if (identical) {
            System.out.println("The two matrices are identical.");
        } else {
            System.out.println("The two matrices are not identical.");
        }
    }
}
