public class Cat extends Animal1 {
    public void makeSound() {
        System.out.println("Cat make sound here");
    }
    public static void main(String[] args) {
        Animal1 dog=new Dog1();
        dog.makeSound();
        Animal1 cat=new Cat();
        cat.makeSound();
    }
}
