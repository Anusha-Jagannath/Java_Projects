package comparators;

import java.util.Comparator;

public class SortbyNameThenMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.marks > o2.marks) return 1;
        else if (o1.marks < o2.marks) return -1;
        else return o1.name.compareTo(o2.name);
    }
}
