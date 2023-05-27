public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }

    public static void main(String[] args) {
        Person person = new Person("Md_Abdur_Rahim");
        person.introduce();
    }
}
