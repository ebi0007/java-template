package HomeWork;
import java.lang.reflect.Array;
import java.util.Random;
public class HM9_max_min_in_array {
    public static void main (String []args){
        Random R = new Random();
        float[] arr=new float [30];
        for (int i=0;i <30;i++)
            arr[i]=(R.nextInt(20)+20)/2;
        System.out.println("numbers is: ");
        for (float element: arr)
            System.out.print(element+" ");
        System.out.println();
        find_max(arr);
        find_min(arr);
        find_avg(arr);

    }

    public static void find_max(float arr[]){
        int size= Array.getLength(arr);
        float max=arr[0];
        for (int i=1; i<size;i++){
            if (arr[i]>max){
                max=arr[i];}}
        System.out.println("the max is: "+max);
    }

    public static void find_min(float arr[]) {
        int size = Array.getLength(arr);
        float min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("the min is: " + min);
    }

    public static void find_avg(float arr[]){
        int size = Array.getLength(arr);
        float sum =0;
        for (int i=0;i<size;i++){
            sum+=arr[i];
        }
        float avg=sum/size;
        System.out.println("the average is: "+avg);
    }
}
