package Learn_java_opp_Daffodil_university;

public class Test {
    public static void main(String[] args) {
        Shape s1=new Shape();                   //Dynamic way polymorphism
        Shape s2=new Rectangle(10,20);       //Dynamic way polymorphism
        Shape s3=new Triangle(10,33);    //Dynamic way polymorphism
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}
