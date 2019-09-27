package Collections;

import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<Double> grade=new LinkedList<Double>();
        grade.add(new Double(14.25));
        grade.add(25.63);
        grade.add(new Double(15));
        Double x=grade.get(1);
        double y=grade.get(0);

        // Casting from double to int
        int y2=(int)y;
        System.out.println(y2);

        for(Double i:grade){
            System.out.print(i+" ");
        }

        // Objective LinkList
        LinkedList<Student> st2= new LinkedList<>();
        st2.add(new Student("ebinem"));
        //or
        Student newSt=new Student("ebi");
        st2.add(newSt);






    }
}
