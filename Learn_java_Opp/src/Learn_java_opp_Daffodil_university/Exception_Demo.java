package Learn_java_opp_Daffodil_university;

public class Exception_Demo {
    public static void main(String[] args) {
        try {
            int x=10,y=0;
            int result= x / y;
            System.out.println(+result);

        }catch (ArithmeticException e){

            System.out.println("ArithmeticException"+e);
        }

        System.out.println("Last line programe");
    }
}
