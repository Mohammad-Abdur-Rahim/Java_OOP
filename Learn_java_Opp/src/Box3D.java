public class Box3D extends Box {
    private double height;
    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }
    public void setDimensions(double length, double breadth, double height) {///just question set value this is use
        super.setDimensions(length, breadth);
        this.height = height;
    }
    public double calculateVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box3D box3d = new Box3D(10.0, 5.0, 3.0);
        System.out.println("Box3D - Length: " + box3d.length + ", Breadth: " + box3d.breadth + ", Height: " + box3d.height);
        System.out.println("Area: " + box3d.calculateArea());
        System.out.println("Volume: " + box3d.calculateVolume());

        box3d.setDimensions(8.0, 4.0, 6.0);
        System.out.println("\nBox3D - Length: " + box3d.length + ", Breadth: " + box3d.breadth + ", Height: " + box3d.height);
        System.out.println("Area: " + box3d.calculateArea());
        System.out.println("Volume: " + box3d.calculateVolume());
    }
}
