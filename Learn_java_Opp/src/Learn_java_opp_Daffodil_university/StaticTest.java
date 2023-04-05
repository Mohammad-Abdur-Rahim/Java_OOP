package Learn_java_opp_Daffodil_university;

public class StaticTest {
    public static void main(String[] args) {
        StaticMethod ob1=new StaticMethod();
        ob1.display1();          // non static method here
        StaticMethod.display2(); //static method here
    }
}
