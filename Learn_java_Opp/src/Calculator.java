public class Calculator {

    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(double a, double b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        calculator1.add(10,20);
        calculator2.add(2.00,2.00);

    }
}
