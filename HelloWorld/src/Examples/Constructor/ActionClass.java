package Examples.Constructor;
import java.util.Scanner;

public class ActionClass {
    public static void main (String[]args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.next();
        System.out.println("Enter your age:");
        int age =input.nextInt();


        SubClass obj=new SubClass(name,age);
        obj.PrintTxt();



    }
}
