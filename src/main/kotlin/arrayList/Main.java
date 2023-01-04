package arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning arrayList");
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("op");
        vegetables.add("kl");
        vegetables.add("fg");


        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("jk");
        fruits.add("hi");

        fruits.addAll(vegetables);
        System.out.println(fruits);
        System.out.println(fruits.get(12));
        System.out.println(fruits.set(1,"op"));
        fruits.removeAll(vegetables);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("jk"));

        String arr[] = new String[fruits.size()];
        fruits.toArray(arr);


        Pair<String, Integer> pair = new Pair("asd",34);
        Pair<Boolean, Integer> pair2 = new Pair(true,"3");

    }
}
