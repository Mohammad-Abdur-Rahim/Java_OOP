package Learn_java_opp_Daffodil_university;

public class Output {

    public static void main(String[] args)
    {
        try
        {
            System.out.printf("1");
            int data = 5 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("2");
            System.exit(0);  // programe execude this line end
        }
        finally
        {
            System.out.printf("3");
        }
        System.out.printf("4");
    }
}




