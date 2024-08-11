package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;
import java.util.Scanner;

/**
 Show 5 options to user
 i.	CREATE , READ , UPDATE , DELETE
 ii.	Let user choose any one of the option
 iii.	Under every option ask user the number of times
 iv.	Print the option name to the number of times that user enters.
 v.	If a user enters the option which is not in the option list display TRY AGAIN !!

 */
public class CRUD_OPTIONS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Choose an option from the list below:");
        System.out.println("1. CREATE");
        System.out.println("2. READ");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");


        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        String optionName = "";
        switch (choice) {
            case 1:
                optionName = "CREATE";
                break;
            case 2:
                optionName = "READ";
                break;
            case 3:
                optionName = "UPDATE";
                break;
            case 4:
                optionName = "DELETE";
                break;
            default:
                System.out.println("TRY AGAIN!!");
                return;
        }


        System.out.print("How many times do you want to print \"" + optionName + "\"? ");
        int times = sc.nextInt();


        for (int i = 0; i < times; i++) {
            System.out.println(optionName);
        }
    }

}
