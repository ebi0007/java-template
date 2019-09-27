package Examples;

import java.util.Arrays;
public class Example_Array {
    public  static void main (String[] args){

////////////////////// arrays        /////
        String[] str={"Ebi","hasan"};
     //   int[] xx= new int [10];
        int number[]={1,25,6,58,48,74,65,23};
        int number1[]=number;
/////////////////////// sort  ************************** ***********
        Arrays.sort( number);
///////////////////// index adad morede nazar ro  midahad. *********
        int a=Arrays.binarySearch(number,65);
        System.out.println(a);
///////////////////// Print all the array elements  *****************
       for (int element: number)
            System.out.println(element);
////////////////////// if equal arr1 and arr2 ***********************
        boolean flag= Arrays.equals(number,number1);
        System.out.println(flag);
//////////////////////// insert  5 to arr  **************************
        int b[]=number;
        Arrays.fill(b,4);






    }
}
