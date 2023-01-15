package sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning set data structures");
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        System.out.println(s1.add(3));
        //do not adds repetitive elements
        //hash set key value pair
        //linked hash set get the element in same order
        //tree set to get element in sorted order

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s1.retainAll(s2);

    }
}
