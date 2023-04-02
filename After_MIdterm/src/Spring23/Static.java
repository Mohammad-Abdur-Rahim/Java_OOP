package Spring23;

public class Static {
  static int count=0;
    Static(){
        count++;
    }
    void display(){
        System.out.println("Total object : "+count);
    }
}
