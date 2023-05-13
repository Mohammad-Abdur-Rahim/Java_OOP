package Abstraction_Example;

public class Rectangle extends Shape {
    Rectangle(double dm1, double dm2){
              super(dm1,dm2);
    }
    void area(){
        double  result = dm1 * dm2 ;
        System.out.println("Rectangle area "+result);
    }
}
