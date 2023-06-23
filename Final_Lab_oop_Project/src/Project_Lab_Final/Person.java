package Project_Lab_Final;

public class Person {
    private String name;
    private int age;
    Animal animal;
    Car car;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void animal() {
        System.out.println("I have a Cute Cat In My Home");

    }

    public void car() {
        System.out.println("I have a dream car BMW Inshallah ");
    }
}



