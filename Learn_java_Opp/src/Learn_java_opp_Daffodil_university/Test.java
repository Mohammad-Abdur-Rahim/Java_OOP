package Learn_java_opp_Daffodil_university;

public class Test {
    public static void main(String[] args) {
        Shape [] s = new Shape[3];
        s[0] =new Shape();                   //Dynamic Array use
        s[1]=new Rectangle(10,20);       //Dynamic Array use
        s[2]=new Triangle(10,33);    //Dynamic Array use
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
    }
}
