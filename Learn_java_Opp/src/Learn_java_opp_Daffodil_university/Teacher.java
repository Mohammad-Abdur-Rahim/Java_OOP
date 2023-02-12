package Learn_java_opp_Daffodil_university;

public class Teacher {  // How to Declare (Class to Object).....................
    String name,gender; // variable assign only
    int age;
    Teacher(String n,String g,int a){ // Constructror =Class name........
        name=n;
        gender=g;
        age=a;
    }

    void display(){  //Method Create here......
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
    }
}
