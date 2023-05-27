public class B extends A {
    public void display() {
        System.out.println("This is class B override");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display();

        B obj2 = new B();
        obj2.display();

    }
}
