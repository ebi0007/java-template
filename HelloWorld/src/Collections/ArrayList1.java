package Collections;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // String arraylist
        ArrayList<String> list=new ArrayList<String>();
        list.add("ebinem");
        list.add("shakh");
        list.add("hasan");
        list.add("ali");
        list.remove(0);
        list.remove("ali");
        if (list.contains("hasan")) System.out.println("hasan");
        System.out.println(list.get(0));

        // objective ArrayeList
        ArrayList<Student> st=new ArrayList<Student>();
        st.add(new Student("ebi"));
        st.add(new Student("miri"));


        // Convert arr to ArrList
        ArrayList<Integer> ArrL=new ArrayList<>();
        int[] arr={1,5,8,9,3,7};
        for (int i=0;i<arr.length;i++){
            ArrL.add(arr[i]);
        }
        for (Integer i:ArrL){
            System.out.print(i+" ");
        }

        //Convert ArrList to arr
        System.out.println();
        int[] arr2=new int[ArrL.size()];
        for (int i=0;i<ArrL.size();i++){
            arr2[i]=ArrL.get(i);
        }
        for(int i:arr2){
            System.out.print(i+" ");
        }




    }
}
