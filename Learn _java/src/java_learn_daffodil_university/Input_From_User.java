package java_learn_daffodil_university;
import java.util.Scanner;

public class Input_From_User {
    public static void main(String[] args) {
    int id,price;
    String tittle,description,category;


    //User Id input coding.................
    Scanner input_id = new Scanner(System.in);
    System.out.print("Enter your Id :");
    id=input_id.nextInt();
    System.out.println("Id ="+id);
    //User Id input coding end.............




        //User Price input coding.................
        Scanner input_price = new Scanner(System.in);
        System.out.print("Enter your Price :");
        price=input_price.nextInt();
        System.out.println("Price ="+price);
        //User Price input coding end.............



        //User Tittle input coding.................
        Scanner input_tittle = new Scanner(System.in);
        System.out.print("Enter your Tittle :");
        tittle=input_tittle.nextLine();
        System.out.println("Tittle ="+tittle);
        //User Tittle input coding end.............

        //User Description input coding.................
        Scanner input_description = new Scanner(System.in);
        System.out.print("Enter your Description :");
        description=input_description.nextLine();
        System.out.println("Description ="+description);
        //User Description input coding end.............

        //User Category input coding.................
        Scanner input_category = new Scanner(System.in);
        System.out.print("Enter your Category :");
        category=input_category.nextLine();
        System.out.println("Category ="+category);
        //User Category input coding end.............
    }
}
