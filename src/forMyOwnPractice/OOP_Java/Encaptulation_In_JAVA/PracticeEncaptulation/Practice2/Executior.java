package forMyOwnPractice.OOP_Java.Encaptulation_In_JAVA.PracticeEncaptulation.Practice2;


public class Executior {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A123", "Ram Dahal");
        account.depositMoney(1000);

        System.out.println(" Withdraw: "+ account.withdrawMoney(500));

       account.depositMoney(-50);
       account.withdrawMoney(0);

    }
}
