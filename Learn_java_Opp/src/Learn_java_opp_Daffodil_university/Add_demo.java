package Learn_java_opp_Daffodil_university;

public class Add_demo {
    void add(int ...num){  //Receive value int ... and num= array type receive
        int sum=0;
        for (int x:num){        // and use for each loop add sum
            sum=sum+x;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Add_demo ob=new Add_demo();   // pass parameter value as you wish
        ob.add(10,20);
        ob.add(10,20,4);
        ob.add(10,20,80,8);
    }
}
