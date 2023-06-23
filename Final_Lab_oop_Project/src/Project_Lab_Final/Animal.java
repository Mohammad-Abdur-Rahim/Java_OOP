package Project_Lab_Final;

public abstract class Animal {

    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public Animal(String name, int age) {

    }

    public void walk(){
        System.out.println("Every Animal Different Type of Walk");
    }

    public abstract void eat();
}
