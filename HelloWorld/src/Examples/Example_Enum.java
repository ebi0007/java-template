package Examples;
import java.util.Scanner;

public class Example_Enum {
    enum Days{
        shanbe,yekshanbe,doshanbe,seshansbe,chaharshanbe,panjshanbe,jome
    };
    public static void main (String []args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int  number = input.nextInt();

        switch (number){
            case 0 : System.out.println(Days.shanbe);break;
            case 1 : System.out.println(Days.yekshanbe);break;
            case 2 : System.out.println(Days.doshanbe);break;
            case 3 : System.out.println(Days.seshansbe);break;
            case 4 : System.out.println(Days.chaharshanbe);break;
            case 5 : System.out.println(Days.panjshanbe);break;
            case 6 : System.out.println(Days.jome);break;
        }







    }
}