package Learn_java_opp_Daffodil_university;

public class Factorial_Recursion {
    int fact(int n){   //Method Recursion
        if (n==1) {
            return 1;
        }
        else {
          return   n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        Factorial_Recursion ob=new Factorial_Recursion();

        System.out.println(+ob.fact(5));  // Pass 5 Factrorial
    }
}
