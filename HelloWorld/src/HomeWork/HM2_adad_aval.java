package HomeWork;
import java.util.Scanner;

public class HM2_adad_aval {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("عدد مورد نظر را وارد کنید:");
        int number=input.nextInt();
        Adade_aval(number);
    }
/////////////////////////////////////////////////////////////
    public static void Adade_aval(int input){
        boolean flag;
        flag=false;
        for (int i=2;i<input/2;i++){
            if (input%i==0)  flag=true;
        }
        if (flag) System.out.println("عدد وارد شده اول نیست.");
        else      System.out.println("عدد وارد شده اول است.");

    }
////////////////////////////////////////////////////////////////////



}
