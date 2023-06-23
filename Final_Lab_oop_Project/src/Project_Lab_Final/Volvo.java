package Project_Lab_Final;

public class Volvo extends Car{
    double price;
    String productionYear;
    String registrationNumber;
    Engine eng;
    DashBoard db;
    public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db)
    {
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.eng=eng;
        this.db=db;
    }
    public void changeFuel()
    {
        System.out.println("This is Fuel Changing Functions. ");
    }
    public void checkBattery()
    {
        System.out.println("This is Checking battery Function. ");
    }

}
