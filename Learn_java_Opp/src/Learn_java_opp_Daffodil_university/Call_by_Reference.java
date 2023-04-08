package Learn_java_opp_Daffodil_university;

public class Call_by_Reference {

    String name;
    void change(Call_by_Reference r2){  // Receive value x but X main value 10 not change that is
                            //call by Value
        r2.name="Md Rahim";
    }


    public static void main(String[] args) {
        Call_by_Reference ob1=new Call_by_Reference();
        ob1.name="Anis";

        System.out.println("Print Second: "+ob1.name);
        ob1.change(ob1);
        System.out.println("Print Second: "+ob1.name);
    }
}

