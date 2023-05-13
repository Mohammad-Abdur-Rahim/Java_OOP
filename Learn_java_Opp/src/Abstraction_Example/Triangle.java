package Abstraction_Example;

public class Triangle extends Shape {
    Triangle(double dm1, double dm2){
        super(dm1,dm2);
    }
    void area(){
        double  result = 0.5 * dm1 * dm2 ;
        System.out.println("Rectangle area "+result);
    }
}
