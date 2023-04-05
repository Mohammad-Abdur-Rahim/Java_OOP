package Learn_java_opp_Daffodil_university;

public class StaticBlock {
    static String name;
    static int id;


    static {                    //Static block here
        name="md abdur rahim";
        id=221-15-5915;
    }


    static void display(){
        System.out.println("Name is :"+name);
        System.out.println("Id is :"+id);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }
}
