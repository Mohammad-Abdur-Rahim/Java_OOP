package Spring23;

public class Static {
    String name ;
    String gender;
    static String UniversityName="Daffodil"; //declare static
    Static (String n,String g){
        this.name=n;
        this.gender=g;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("University :"+UniversityName);
    }
}
