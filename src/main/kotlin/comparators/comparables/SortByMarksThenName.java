package comparators.comparables;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class SortByMarksThenName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }
}
