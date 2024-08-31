package forMyOwnPractice.FunctionInJava.com.Recursion;


import java.util.Scanner;

public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi problem
    public static void solveHanoi(int n, char source, char auxiliary, char target) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, target, auxiliary);

        // Move the nth disk from source to target
        System.out.println("Move disk " + n + " from " + source + " to " + target);

        // Move the n-1 disks from auxiliary to target
        solveHanoi(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        solveHanoi(n, 'A', 'B', 'C');

    }
}
