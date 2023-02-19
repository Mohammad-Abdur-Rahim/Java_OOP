package Learn_java_opp_Daffodil_university;

public class  Person {
 private String name;
 private int id;
//just variable declare here end
 public Person(String name, int id){ // constructor receive value form main function obj...
  this.name=name;
  this.id=id;
 }
public void setName(String name){ //important keyword oop just value assign.....
  this.name=name;
}
 public void setid(int id){      //important keyword oop just value assign.....
  this.id=id;
 }

public String getName(){       // get keyword just value return.....
  return name;
}
public int getId(){             // get keyword just value return.....
  return id;
}

 public static void main(String[] args) {
  Person p1 =new Person("Md_Abdur_Rahim",5915);  // This line value store 7 number line public person
 System.out.println(p1.name);
  System.out.println(p1.id);
  System.out.println(p1.getName());
  System.out.println(p1.getId());
  // set is value update and get value return.
  p1.setName("Ms Fatema Akter");
  System.out.println(p1.getName());

 }

}

