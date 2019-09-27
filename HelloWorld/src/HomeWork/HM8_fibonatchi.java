package HomeWork;
import  java.util.Scanner;
public class HM8_fibonatchi {
    public static void main (String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("inter ur number : ");
        int in=inp.nextInt();
      int   in1=in-1;
        System.out.println(" fibonachi for "+in+" is: ");
        int arr[]= new int[in];
        arr[0]=1;
        arr[1]=1;

        System.out.print("1,1,");
        for (int i=2;i<=in1;i++){
             arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+",");
        }






    }
}
