package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Box_Volume;

public class MainProgram {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        //initialize each box
        myBox1.dislayDim(10,20,15);
        myBox2.dislayDim(3,6,9);

        //get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of first box
        vol = myBox2.volume();
        System.out.println("Volume is " + vol);



    }
}
