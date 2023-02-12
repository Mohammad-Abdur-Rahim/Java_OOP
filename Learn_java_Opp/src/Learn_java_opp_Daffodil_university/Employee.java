package Learn_java_opp_Daffodil_university;

import javax.xml.namespace.QName;

public class Employee {
    int id;
    String Name;

    Employee(int x,String y){
        this.id=x;
        this.Name=y;
    }
    void info(){
        System.out.println("Id:"+id);
        System.out.println("Id:"+ Name);
    }

}
