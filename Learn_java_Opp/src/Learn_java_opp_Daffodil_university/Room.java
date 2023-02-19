package Learn_java_opp_Daffodil_university;

public class Room {
    int roomno;
    String roomtype;
    Float roomarae;
    Boolean machine;

    public  Room() {
System.out.println("Helo");
    }
    public Room(int roomno,String roomtype,Float roomarae,Boolean machine){
        this.roomno=10;
        this.roomtype="good";
        this.roomarae=12.22F;
        this.machine=true;


    }
    public void  display(){
        System.out.println("roomno:"+roomno);
        System.out.println("roomtype:"+roomtype);
        System.out.println("roomarea:"+roomarae);
        System.out.println("machine:"+machine);

    }


    public static void main(String[] args) {
        Room obj =new Room(10,"good",12.2F,true);
        Room obj1 =new Room();
        obj.display();


    }



}