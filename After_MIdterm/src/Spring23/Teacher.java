package Spring23;

public class Teacher {
String name,gender;
int age;

    Teacher(){ //default constructor
        System.out.println("Default Constructor");
    }
Teacher(String name,String gender,int age){ //Receive value constructor
    this.name=name;
    this.gender=gender;
    this.age=age;

}


void display(){
    System.out.println("Name:"+name);
    System.out.println("Name:"+gender);
    System.out.println("Name:"+age);
    System.out.println("\n");

}
}
