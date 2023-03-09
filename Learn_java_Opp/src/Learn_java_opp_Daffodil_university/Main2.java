package Learn_java_opp_Daffodil_university;

public class Main2 {
    public static void main(String[] args) {
        Engine eng = new Engine(34.7);
        DashBoard db= new DashBoard(5.0);
        Volvo v=new Volvo(700,"2022", "DHA34567",eng,db);
        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        v.model="SUV. XC40";
        v.company="Volvo";

    }

}
