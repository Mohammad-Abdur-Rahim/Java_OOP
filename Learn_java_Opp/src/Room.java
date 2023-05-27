public class Room {
    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean ACMachine;

    public void setData(int roomNo, String roomType, double roomArea, boolean ACMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.ACMachine = ACMachine;
    }

    public void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq. units");
        System.out.println("AC Machine: " + (ACMachine ? "Installed" : "Not Installed"));
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.setData(101, "Single", 250.5, true);
        room.displayData();
    }
}
