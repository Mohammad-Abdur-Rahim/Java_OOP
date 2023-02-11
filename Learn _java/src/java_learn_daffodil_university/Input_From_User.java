package java_learn_daffodil_university;
import java.util.Scanner;

public class Input_From_User {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in); //input use Scanner this line with variable.1st steap


        System.out.print("Enter any number:");
        number=input.nextInt();                 //2nd steap decalre the scanner vale store
        System.out.println("number is ="+number);
    }
}
