public class Point {
    private int x, y;

    public Point() {
System.out.println("Nothing");
    }

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        System.out.println(+x);
    }

    public void setY(int y) {
        System.out.println(+y);
    }

    public void setXY(int x, int y) {
        System.out.println("x"+x);
        System.out.println("y"+y);
    }

    public static void main(String[] args) {
        Point p1=new Point(10,20);
        p1.setX(10);
        p1.setY(20);
        p1.setXY(100,90);
    }

}