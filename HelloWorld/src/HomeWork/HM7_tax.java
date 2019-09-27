package HomeWork;
import java.util.Scanner;
public class HM7_tax {
    public static void main (String []args){
        Scanner inp= new Scanner(System.in);
        System.out.println("inter ur number between 0 to 500:");
        int input= inp.nextInt();
         if (input<200) System.out.println("tax is: "+ 0);
         else if (200<=input & input<300) System.out.println("tax is : "+0.07*(input-200));
         else if (300<= input & input< 500) System.out.println("tax is : "+0.12*(input-200));

    }
}
