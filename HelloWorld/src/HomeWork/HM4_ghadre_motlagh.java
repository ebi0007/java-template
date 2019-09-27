package HomeWork;
import java.util.Scanner;
public class HM4_ghadre_motlagh {
        public static void main(String[]args){
                System.out.println("insert your number ");
                Scanner input= new Scanner(System.in);
                int input_n=input.nextInt();
                int out_n;
                if (input_n<0) out_n=-(input_n);
                else out_n=input_n;
                System.out.println("absulote is : "+out_n);




        }
}
