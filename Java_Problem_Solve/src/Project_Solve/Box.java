package Project_Solve;

public class Box {
    double height;
    double width;
    double depth;
    Box(double h,double w,double d){
        this.height=h;
        this.width=w;
        this.depth=d;
    }
    void DisplayVol(){
        double volume =height*width*depth;
        System.out.println("box Volume :"+volume);
    }
}
