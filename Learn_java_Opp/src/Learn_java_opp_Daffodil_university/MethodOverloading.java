package Learn_java_opp_Daffodil_university;

public class MethodOverloading {
    void add(int a,int b){         // MethodOverloading 1
        System.out.println(a+b);

    }
    void add(int a,int b,int c){ //MethodOverloading 2
        System.out.println(a+b+c);
    }
    void add(double a,double b){ //MethodOverloading 3
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj1=new MethodOverloading();
        obj1.add(10,20);
        obj1.add(10,20,30);
        obj1.add(10.0,20.0);

    }
}
