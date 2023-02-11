package java_learn_daffodil_university;
import java.util.Scanner;

public class Input_From_User {
    public static void main(String[] args) {
  String name;
  Scanner input=new Scanner(System.in);   //1st steap Scanner declare

        System.out.println("Enter your name:");
        name=input.nextLine();             // 2nd steap user value declare
        System.out.println("Name Is:"+name);  // string = next() vs nextline()................important
    }
}
