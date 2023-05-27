public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + this.breed);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The dog is eating dog food.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Labrador");
        dog.displayInfo();
        dog.eat();
    }
}
