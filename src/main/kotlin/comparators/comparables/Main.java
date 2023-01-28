package comparators.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning comparators and comparables");
        List<Student> list = new ArrayList<>();
        list.add(new Student(23,"anusha"));
        list.add(new Student(10,"amith"));
        list.add(new Student(25,"sad"));
        list.add(new Student(30,"jeevan"));
        list.add(new Student(25,"fif"));

//        Collections.sort(list, new SortByMarksThenName());
          Collections.sort(list, ( o1, o2) ->{
                  return o1.marks - o2.marks;
          });

          Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
        Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

        for(Student student : list) {
            System.out.println(student.marks+" "+student.name);
        }
    }
}
