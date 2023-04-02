package Spring23;

public class Teacher {
String name,gender;
int age;

void display(){
    System.out.println("Name:"+name);
    System.out.println("Name:"+gender);
    System.out.println("Name:"+age);
}
    public static void main(String[] args) {


        Teacher t1=new Teacher();
        t1.name="Md";
        t1.gender="male";
        t1.age=99;
        t1.display();

        Teacher t2=new Teacher();
        t2.name="rahim";
        t2.gender="female";
        t2.age=100;
        t2.display();

    }
}
