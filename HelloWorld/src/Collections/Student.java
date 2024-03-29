package Collections;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String out(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
