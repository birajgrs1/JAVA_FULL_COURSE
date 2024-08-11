package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class CoordinateFinder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter (x) coordinate: ");
        int x=sc.nextInt();
        System.out.println("X coordinate: "+x);

        System.out.println("Enter (y) coordinate: ");
        int y=sc.nextInt();
        System.out.println("First Value: "+y);

        if (x > 0 && y > 0){
            System.out.println("First Coordinate");
        }
        else if (x<0 && y>0){
            System.out.println("Second Coordinate");
        }
        else if(x < 0 && y< 0){
            System.out.println("Third Coordinate");
        }
        else if(x> 0 && y<0){
            System.out.println("Forth Coordinate");
        }
        else{
            System.out.println("Center points.");
        }

    }
}
