package Learn_java_opp_Daffodil_university;

import java.util.Scanner;

public class Transport {
    int speed;
    void run(){
        System.out.println("Run Any Transport");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //User input here.
        int a =input.nextInt();
        int b =input.nextInt();
                                                //user input assign a,b variable.
        Bike bike=new Bike();
        bike.run(a);                    //object create and pass the value other class receive Construct way

        Car car=new Car();
        car.run(b);                      //object create and pass the value other class receive Construct way
    }
}
