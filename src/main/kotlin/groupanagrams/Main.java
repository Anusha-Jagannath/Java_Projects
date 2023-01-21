package groupanagrams;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        System.out.println("Grouping anagrams");

    }

//    static List<List<String>> groupAnagram(String input[]) {
//        Map<String, List<String>> map  = new HashMap<>();
//        for(String s: input) {
//            char[] c = s.toCharArray();
//            Arrays.sort(c);
//            String newString = new String(c);
//
//            if (!map.containsKey(newString)) {
//                map.put(newString, new LinkedList<String>());
//            }
//
//            map.get(newString).add(s);
//
//        }
//
//        //return map.values();
//    }
}
