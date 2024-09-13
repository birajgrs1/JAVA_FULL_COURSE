package forMyOwnPractice.OOP_Java.Inheritance_JAVA.InheritanceBasic.SingleInheritance.Practice3;

public class MainProgram {
    public static void main(String[] args) {
        Programmer prog = new Programmer();

        prog.getIncentive();
        prog.getData();

        System.out.println("\n---------- Programmer Details ----------\n");
        prog.display();
        prog.printIncentive();
    }
}
