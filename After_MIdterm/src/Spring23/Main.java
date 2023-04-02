package Spring23;

public class Main {
    public static void main(String[] args) {


        Teacher t1=new Teacher("Rahim","male",99); // pass value constructor
        t1.display();

        Teacher t2=new Teacher("sakib","male",111);
        t2.display();

        Teacher t3=new Teacher(); //default constructor
        t3.display();

    }

}
