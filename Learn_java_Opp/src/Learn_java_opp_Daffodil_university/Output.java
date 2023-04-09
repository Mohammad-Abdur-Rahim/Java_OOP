package Learn_java_opp_Daffodil_university;

public class Output {

    private void m1()
    {
        m2();
        System.out.printf("1");
    }
    private void m2()
    {
        m3();
        System.out.printf("2");
    }
    private void m3()
    {
        System.out.printf("3");
        try
        {
            int sum = 4/0;
            System.out.printf("4");
        }
        catch(ArithmeticException e)
        {
            System.out.printf("5");
        }


        System.out.printf("7");
    }
    public static void main(String[] args)
    {
        Output obj = new Output();
        obj.m1();
    }
}



