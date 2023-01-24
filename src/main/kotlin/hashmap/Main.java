package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning hashmap internal working");
        //put
        //putAll
        //putIfAbsent
        //get(K)
        //containsKey
        //containsValue
        //replace(K,V)
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("one",10);
        map.putIfAbsent("one",9);
        System.out.println(map);
        System.out.println(map.get("three"));
        System.out.println(map.containsKey("three"));
        System.out.println(map.containsValue(9));
        System.out.println(map.replace("one",1,10));
        System.out.println(map.remove("one"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue() * 10);
        }
//        System.out.println(map);

        System.out.println(getHash("CAT"));

    }

    private static int getHash(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++) {
            sum = sum+s.charAt(i);
        }
        return sum;
    }

    //s.charAt(i)*pow(31,n-i)
}
