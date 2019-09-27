package Collections;

import java.util.Comparator;

public class Comparator1 {
    public static void main(String[] args) {
        StudentComparator1 a=new StudentComparator1(20,"Ebi");
        StudentComparator1 b=new StudentComparator1(22,"hasan");

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));



///********************* روش دوم **************************

        Comparator<String> comp= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  (o1.length()<o2.length() ? -1:
                        o1.length()==o2.length()? 0: +1);
            }
        };

        Student c=new Student("ebinem");
        Student d=new Student("shakhs shekan");
        System.out.println();
        System.out.println(comp.compare(c.out(),d.out()));
        System.out.println(comp.compare(d.out(),c.out()));
        System.out.println(comp.compare(c.out(),c.out()));





    }
}
