package forMyOwnPractice.ControlStatements.DecisionMakingAndBranching;

import java.util.Scanner;

public class CheckVowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String Character: ");
        String str = sc.nextLine();

        char ch = str.charAt(0);

        if (ch == 'A' || ch == 'a') {
            System.out.println("Vowel Char");
        }
        else if(ch == 'E' || ch == 'e'){
            System.out.println("Vowel Char");
        }
        else if(ch == 'I' || ch == 'i'){
            System.out.println("Vowel Char");
        }
        else if(ch == 'O' || ch == 'o'){
            System.out.println("Vowel Char");
        }
        else if(ch == 'U' || ch == 'u'){
            System.out.println("Vowel Char");
        }
        else{
            System.out.println("Consonant char");
        }
    }
}
