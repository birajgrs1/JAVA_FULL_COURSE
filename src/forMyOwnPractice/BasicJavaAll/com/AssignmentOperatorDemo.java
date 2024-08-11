package forMyOwnPractice.BasicJavaAll.com;

public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a=5;
        int var;

        System.out.println("Value of a: "+a);

        //Assigning value using =
        var=a;
        System.out.println("After assigning = :"+var);

        //Assigning value using +=
        var +=a;
        System.out.println("After assigning += :"+var);

        //Assigning value using -=
        var -=a;
        System.out.println("After assigning -= :"+var);

        //Assigning value using *=
        var *=a;
        System.out.println("After assigning *= :"+var);

        //Assigning value using /=
        var /=a;
        System.out.println("After assigning /= :"+var);

        //Assigning value using %=
        var %=a;
        System.out.println("After assigning %= :"+var);

    }
}
