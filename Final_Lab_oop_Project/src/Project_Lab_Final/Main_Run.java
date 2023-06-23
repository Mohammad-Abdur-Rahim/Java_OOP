package Project_Lab_Final;

public class Main_Run {

        public static void main(String[] args) {

            Person p1= new Person("MD ABDUR RAHIM",22);

            System.out.println(("Name: "+p1.getName()));
            System.out.println("Age=" +p1.getAge());
            p1.animal();

            Cat cat1 = new Cat();


            cat1.play();
            cat1.eat();

            p1.car();

            Engine eng = new Engine(120.4);
            DashBoard db= new DashBoard(8.0);
            Volvo v=new Volvo(9980000,"2012", "DHAKA999",eng,db);
            System.out.println("Car Price: "+v.price);
            System.out.println("production year: "+v.productionYear);
            System.out.println("registration is: "+v.registrationNumber);
            v.drive();
            v.stop();
            v.changeFuel();
            v.checkBattery();
            v.model="BMW999";
            v.company="BMW";

        }
    }



