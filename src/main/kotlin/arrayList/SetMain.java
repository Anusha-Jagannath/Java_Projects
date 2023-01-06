package arrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String args[]) {
        System.out.println("Learning the set");
        Set<String> set = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new TreeSet<>();

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);


        set.add("apple");
        set.add("hello");
        set.add("kiwi");

        System.out.println(set);
    }
}
