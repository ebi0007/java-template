package Collections;

import java.util.ArrayList;

public class CollectionToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrL=new ArrayList<>();
        arrL.add(25);
        arrL.add(63);
        arrL.add(36);
        arrL.add(89);
        arrL.add(49);
        arrL.add(34);

        //Convert to Array
        Integer[] arr=arrL.toArray(new Integer[arrL.size()]);
        Integer[] arr2= arrL.toArray(new Integer[0]);
    }
}
