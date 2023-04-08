package Learn_java_opp_Daffodil_university;

public class Teacherr extends PersonR{

   private String qualifiaction;

    public void setQualifiaction(String qualifiaction) {
        this.qualifiaction = qualifiaction;
    }

    public String getQualifiaction() {
        return qualifiaction;
    }
    void display(){                            // void method function here
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getId());
        System.out.println("Qualifiacation:"+getQualifiaction());

    }

    public static void main(String[] args) {   // declare all vale
       Teacherr obj= new Teacherr();
       obj.setName("MD ABDUR RAHIM");
       obj.setId(5915);
       obj.display();
       obj.setQualifiaction("MSC IN CSE");


    }
}
