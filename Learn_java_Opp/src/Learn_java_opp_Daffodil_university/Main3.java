package Learn_java_opp_Daffodil_university;

public class Main3 {
    public static void main(String[] args) {
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");

        Emp e=new Emp(111,"varun",address1);
        Emp e2=new Emp(112,"arun",address2);

        e.display();
        e2.display();

    }
}


