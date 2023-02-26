package arrayListdatas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
       System.out.println("Learning array list data structure");
       ArrayList<String> fruits = new ArrayList();
       fruits.add("apple");
       fruits.add("vegetable");
       fruits.add("mango");


        ArrayList<String> vegetable = new ArrayList();
        fruits.add("chana");
        fruits.add("vegetable");
        fruits.add("yui");

        fruits.addAll(vegetable);


       System.out.println(fruits);

       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(100);
       arrayList.add(1002);
       arrayList.add(99);

       ArrayList<Pair> arrayList2 = new ArrayList<>();
       arrayList2.add(new Pair(1,2));
       arrayList2.add(new Pair(1,3));

       String list[] = new String[fruits.size()];
       for(String element: fruits.toArray(list)) {
           System.out.println(element);
       }


    }
}
