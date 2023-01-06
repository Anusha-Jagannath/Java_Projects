package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning sets");

        Set<String> set = new HashSet<>();
        Set<String> set1= new LinkedHashSet<>();
        Set<String> set2 = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        set.add("kiwi");
        System.out.println(set);


        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);

        s1.addAll(s2);
        s1.retainAll(s2);

    }
}
