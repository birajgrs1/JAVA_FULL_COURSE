package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice2;

public class BankAccount {
    private  String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit !!!");
        }
        else{
            balance += amount;
        }
//        balance += amount;
    }

    public double withdrawMoney(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid withdraw !!!");
        }
        else if (amount >= 0) {
            balance -= amount;
        }
        else{
            amount = balance ;
            balance = 0;
        }

        return balance;
    }
}
