package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class ShowStudentResultByGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Mark: ");
        double mark1=sc.nextDouble();

        System.out.println("Enter second Mark: ");
        double mark2=sc.nextDouble();

        System.out.println("Enter third Mark: ");
        double mark3=sc.nextDouble();

        System.out.println("Enter forth Mark: ");
        double mark4=sc.nextDouble();

        System.out.println("Enter fifth Mark: ");
        double mark5=sc.nextDouble();

        double totalMarks= mark1+mark2+mark3+mark4+mark5;
        double percentate=totalMarks/5;

        if (percentate > 90){
            System.out.println("Grade - A+");
        }
        else if (percentate > 80 && percentate < 90){
            System.out.println("Grade - A");
        }
        else if (percentate > 70 && percentate < 80){
            System.out.println("Grade - B+");
        }
        else if (percentate > 60 && percentate < 70){
            System.out.println("Grade - B");
        }
        else if (percentate > 50 && percentate < 60){
            System.out.println("Grade - C+");
        }
        else if (percentate > 40 && percentate < 50){
            System.out.println("Grade - C");
        }
        else{
            System.out.println("Grade - D");
        }

    }

}
