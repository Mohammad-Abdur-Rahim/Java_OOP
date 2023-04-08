package Learn_java_opp_Daffodil_university;

public class Callby_value {

    void change(int i){  // Receive value x but X main value 10 not change that is
                        //call by Value
        i=20;
    }


    public static void main(String[] args) {
        Callby_value obj1=new Callby_value();
        int x=10;
        System.out.println("Print First: "+x);
        obj1.change(x);
        System.out.println("Print Second: "+x);
    }
}
