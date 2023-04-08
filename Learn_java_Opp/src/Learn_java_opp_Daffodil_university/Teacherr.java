package Learn_java_opp_Daffodil_university;

public class Teacherr extends PersonR{

    String qualifiaction;

    void display1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+id);
        System.out.println("Qualification : "+qualifiaction);
    }
    public static void main(String[] args) {
        PersonR ob = new PersonR();
        ob.name="Rahim";
        ob.id=5915;
        ob.display();

        Teacherr ob1 =new Teacherr();
        ob1.name="ms bithi mam";
        ob1.id=999;
        ob1.qualifiaction="Master in CSE";
        ob1.display1();
    }
}
