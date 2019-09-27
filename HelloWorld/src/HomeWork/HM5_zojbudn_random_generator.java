package HomeWork;
import java.util.Random;
public class HM5_zojbudn_random_generator {
    public static void main (String []args){
        Random R= new Random();
//        int a= R.nextInt(100);
//        System.out.println(a);

        int[] arr= new int[30];
        for (int i=0;i <30;i++)
            arr[i]=R.nextInt(100);
        for (int i=0;i <30;i++)
            if (arr[i]%2==0) System.out.print(arr[i]+" ");




    }

}
