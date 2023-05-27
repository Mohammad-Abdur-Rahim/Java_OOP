public class Myclass implements AA,BB {
    public void methodAA() {
        System.out.println("Implementing methodA() from interface A");
    }

    @Override
    public void methodBB() {
        System.out.println("Implementing methodB() from interface B");
    }

    public static void main(String[] args) {
        Myclass myObject = new Myclass();
        myObject.methodAA();
        myObject.methodBB();
    }
}



