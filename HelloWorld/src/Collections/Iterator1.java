package Collections;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrL=new ArrayList<>();
        for (int i= 0;i<=20;i++){
            arrL.add(i);
        }

        Iterator<Integer> itr=arrL.iterator();
        while (itr.hasNext()){
            int value=itr.next();
            if(value%2==1){
                itr.remove();
            }
        }
        for (Integer i:arrL){
            System.out.print(i+" ");
        }

        System.out.println("Example 2: remove ebi prefix items");
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ebi");
        arr.add("ebinem");
        arr.add("ebif");
        arr.add("hasna");
        arr.add("ali");
        arr.add("shakh");

        Iterator<String> itr2= arr.iterator();
        while (itr2.hasNext()){
            String st=itr2.next();
            if(st.startsWith("ebi"))
                itr2.remove();
        }

        for( String j:arr){
            System.out.print(j+" ");
        }





    }
}
