package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning comparators and comparable");
        List<Student> list = new ArrayList<>();
        list.add(new Student(23,"Ram"));
        list.add(new Student(10,"Smitha"));
        list.add(new Student(10,"Anuj"));
        list.add(new Student(26,"Jeena"));
        list.add(new Student(2,"Kavitha"));

//        Collections.sort(list, new SortbyNameThenMarks());
          Collections.sort(list, new Comparator<Student>() {
              @Override
              public int compare(Student o1, Student o2) {
                  if (o1.marks > o2.marks) return 1;
                  else if (o1.marks < o2.marks) return -1;
                  else return 0;
              }
          });
        for (Student s : list) {
            System.out.println(s.name+" "+s.marks);
        }
    }
}
