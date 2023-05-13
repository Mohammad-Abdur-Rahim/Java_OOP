package Abstraction_Example;

public class Circle extends Shape{
    Circle(double r){
        super(r,r);
    }
    void area(){
        double  result = Math.PI *dm1 * dm2 ;
        System.out.println("Rectangle area "+result);
    }
}
