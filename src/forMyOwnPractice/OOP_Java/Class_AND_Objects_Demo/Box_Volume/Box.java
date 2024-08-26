package forMyOwnPractice.OOP_Java.Class_AND_Objects_Demo.Box_Volume;

public class Box {
    double width;
    double height;
    double depth;

    //Compute and return vollume
    double volume(){
        return width * height * depth;
    }

    //set dimensions of box
    void dislayDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
