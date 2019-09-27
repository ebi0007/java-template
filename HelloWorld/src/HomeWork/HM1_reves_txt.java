//package HomeWork;
import java.util.Scanner;
public class HM1_reves_txt {
    public static void main(String [] args){
        System.out.println("insert your text");
        Scanner input=new Scanner(System.in);
        String std = input.next();
        int a=std.length();

        char[] arr=new char[a];

        for(int i=0;i<a;i++){
            arr[i]=std.charAt(a-1-i);
        }
        System.out.print("the text revers is : ");
        for (char element: arr)
            System.out.print(element);






    }
}
