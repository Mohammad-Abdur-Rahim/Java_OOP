package Learn_java_opp_Daffodil_university;

public class Webdeveloper {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
 public void display(){

     System.out.println("name : " +this.getName());   // very important only this.getname is correct because variable private
     System.out.println("id : " +this.getId());
 }



    public static void main(String[] args) {
        Webdeveloper obj =new Webdeveloper();
        obj.setName("Md Abdur Rahim");
        obj.setId(5915);
        obj.display();

    }
}
