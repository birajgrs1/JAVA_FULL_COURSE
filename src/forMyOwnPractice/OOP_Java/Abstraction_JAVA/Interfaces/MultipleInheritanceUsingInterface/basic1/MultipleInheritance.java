package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.MultipleInheritanceUsingInterface.basic1;

/*
class a{
    void show(){
        System.out.println("This is a class A.");
    }
}

class B{
    void show(){
        System.out.println("This is a class B.");
    }
}

 */

interface A{
    void show();   //abstract method and public by-default
}

interface B{
        void disp();
}

class MultipleInheritance implements A,B{
    public void show(){
        System.out.println("Interface for A.");
    }
    public void disp(){
        System.out.println("Interface for B.");
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.show();
        mi.disp();

    }
}


