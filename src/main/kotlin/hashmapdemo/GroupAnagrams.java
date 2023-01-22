package hashmapdemo;

import java.util.*;

public class GroupAnagrams {

    public static void main(String args[]) {
        System.out.println("Learning anagram grouping");
    }


    private static List<List<String>> groupAnagram(String strings[]) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strings) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<>());
            }
            map.get(sorted).add(s);
        }

        return new LinkedList(map.values());
    }
}
