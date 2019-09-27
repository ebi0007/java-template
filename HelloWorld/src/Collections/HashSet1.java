package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        // or Set<String> hset=new HashSet<>();
        hset.add("ebi");
        hset.add("hasan");
        hset.add("shakh");
        hset.add("ebi");
        hset.add("meysam");
        hset.add("hasan");
        hset.remove("ebi");
        // موارد تکراری در مجموعه قرار نمی گیرد.
        // همچنین در مجموعه ها ترتیب خاصی برای قرارگیری عناصر وجود ندارد.
        System.out.println(hset.contains("shakh"));
        for (String i:hset) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Convert HashSet to Array
        String[] arr=hset.toArray(new String[hset.size()]);
        for (String i:arr) {
            System.out.println(i);
        }

        // برای مقایسه آبجکت ها باید متد equel و hashCode   را با کمک IDE در کلاس آبجکت پیاده سازی کنیم.
        HashSet<Student> st = new HashSet<>();
        System.out.println();
        st.add(new Student("ebi"));
        st.add(new Student("hasan"));
        st.add(new Student("shakh"));
        System.out.println(st.contains(new Student("ebi")));

        // Exmaple2   constructure with 2 parameter
        Set<StudentHashSet> st2=new HashSet<>();
        System.out.println();
        StudentHashSet r1=new StudentHashSet("ebi",20);
        StudentHashSet r2=new StudentHashSet("ebi",20);
        st2.add(r1);
        st2.add(r2);
        st2.add(new StudentHashSet("hasan",20));
        st2.add(new StudentHashSet("shakh",20));
        st2.add(new StudentHashSet("ebi",21));
        System.out.println(st2.contains(r2));




    }
}
