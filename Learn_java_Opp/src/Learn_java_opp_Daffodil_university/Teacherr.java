package Learn_java_opp_Daffodil_university;

public class Teacherr extends PersonR{
    public static void main(String[] args) {
        Animal a=new Animal();
        PersonR p=new PersonR();
        Teacherr t=new Teacherr();

        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Teacherr);
        System.out.println(a instanceof Teacherr);
        System.out.println(p instanceof Teacherr);
        System.out.println(p instanceof Animal);
    }
}
