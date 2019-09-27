package HomeWork;
import java.util.Scanner;
public class HM3_adade_kamel {
    public static void main (String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("عدد مورد نظر را وارد کنید:");
        int in=input.nextInt();
        perfect(in);
    }
/////////////\//////////////////////////
    public static void perfect (int input){
        int sum=0;
        for (int i=1;i<=input/2;i++){
            if (input%i==0) sum=sum+i;
        }
        if (input==sum) System.out.println("عدد مورد نظر کامل است.");
       else System.out.println("عدد مورد نظر کامل نیست.");



    }
////////////////////////////////////////////
}
