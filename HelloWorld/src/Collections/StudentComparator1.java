package Collections;

public class StudentComparator1 implements Comparable<StudentComparator1> {
    private int age;
    private String name;

    public StudentComparator1(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(StudentComparator1 o) {
        return (this.age<o.age ? -1:
                this.age==o.age? 0: +1);
        }
}
