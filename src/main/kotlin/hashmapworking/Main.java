package hashmapworking;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning hash map");
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);
        map.put("one",9);
        System.out.println(map);
        System.out.println(map.get("one"));
        System.out.println(map.containsKey("one"));
        System.out.println(map.containsValue(3));
        System.out.println(map.replace("one",9,10));
        System.out.println(map.remove("one"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for(Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.setValue(entry.getValue() * 100));
        }
    }
}
