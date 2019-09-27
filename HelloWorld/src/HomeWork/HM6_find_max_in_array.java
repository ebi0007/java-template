package HomeWork;
import java.util.Random;
public class HM6_find_max_in_array {
    public static void main (String [] args){
        Random R=new Random();
        int arr[]=new int[30];
        for (int i=0;i<30;i++) {
            arr[i]=R.nextInt(100);
            System.out.print(arr[i]+" ");
        }

        int max=arr[0];
        for (int i=0;i<30;i++)
            if (arr[i]>max) {
                max=arr[i];
            }
        System.out.println("\n max in array is: "+max);
    }
}
