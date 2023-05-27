public class Myclass implements AA {
    public void meth1() {
        System.out.println("Implementing meth1() in MyClass");
    }

    @Override
    public void meth2() {
        System.out.println("Implementing meth2() in MyClass");
    }

    public static void main(String[] args) {
        Myclass myObject = new Myclass();
        myObject.meth1();
        myObject.meth2();
    }
}

