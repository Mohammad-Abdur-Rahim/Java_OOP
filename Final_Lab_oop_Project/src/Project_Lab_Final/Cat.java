package Project_Lab_Final;

public class Cat extends Animal implements Pet {
    String name;

    public Cat() {
        super(4);
        System.out.println();
    }

    public Cat(String name) {
        super(4);
        System.out.println("It has " + super.legs + " legs.");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println("This is play Function");
    }

    public void eat() {
        System.out.println("This is eat Function every Animal.\n");
    }
}

