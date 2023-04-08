package Learn_java_opp_Daffodil_university;

public class Rectangle extends Shape {


    double length,width;
    Rectangle(double l,double w){
        this.length=l;
        this.width=w;
    }
    double area(){
        System.out.println("Rectangle Area");
        return length*width;
    }
}
