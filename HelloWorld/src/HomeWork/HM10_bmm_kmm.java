package HomeWork;
import java.util.Scanner;
public class HM10_bmm_kmm {
    public static void main (String[]args){
        System.out.println("enter ur two numbers: ");
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int bm = bmm(a,b);
        System.out.println("bmm is: "+bm);
        int km = kmm(a,b);
        System.out.println("kmm is: "+km);
    }

    public static int bmm(int a,int b){
        if(a%b==0) return b;
        else return bmm(b,a%b);
    }

    public static int kmm(int a,int b){
        int k=(a*b)/bmm(a,b);
        return k;
    }

}
