package groupanagrams;

import java.util.*;

public class GroupAnagrams {

    public static void main(String args[]) {

    }

    private static List<List<String>> groupAnagrams(String s[]) {
        Map<String, List<String>> map = new HashMap<>();
        for(String newString: s) {
            char c[] = newString.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<>());
            } else {
                map.get(sorted).add(newString);
            }
        }

        return new LinkedList<>(map.values());
    }
}
