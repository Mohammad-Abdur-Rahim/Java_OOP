public class Box {
     double length;
     double breadth;
    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void setDimensions(double length, double breadth) {    ///just question set value this is use
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {
        return length * breadth;
    }
}
