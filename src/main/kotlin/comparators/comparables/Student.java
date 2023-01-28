package comparators.comparables;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(int id, String name) {
        this.name = name;
        this.marks = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.marks > o.marks) {
            return 1;
        } else if (this.marks < o.marks) {
            return -1;
        } else return this.name.compareTo(o.name);
    }
}
