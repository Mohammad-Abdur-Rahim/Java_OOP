package Spring23;

public class Static {
  int count=0;
    Static(){
        count++;
    }
    void display(){
        System.out.println("Total object : "+count);
    }
}
