package Learn_java_opp_Daffodil_university;

public class Triangle extends Shape {
    double base,height;
    Triangle(double b,double height){
        this.base=b;
        this.height=height;
    }
    double area(){
        System.out.println("Triangle Area");
    return 0.5*base*height;
    }
}
