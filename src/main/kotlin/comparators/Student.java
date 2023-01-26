package comparators;

import org.jetbrains.annotations.NotNull;

public class Student  {

    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(@NotNull Student o) {
//        if (this.marks > o.marks) return 1;
//        else if (this.marks < o.marks) return -1;
//        return this.name.compareTo(o.name);
//    }
}
