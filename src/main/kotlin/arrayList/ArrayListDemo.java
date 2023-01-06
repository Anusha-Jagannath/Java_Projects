package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]) {
        System.out.println("Learning array list");
        ArrayList<String> fruits  = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pine apple");


        ArrayList<String> vegetable = new ArrayList<>();
        vegetable.add("ui");
        vegetable.add("io");
        vegetable.add("jk");
        fruits.addAll(vegetable);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(100);
        marks.add(20);

        for (Integer i: marks) {
            System.out.println(i);
        }

        Pair<Integer, String> pair = new Pair<>(1,"anusha");
        Pair<Boolean, String> pair1 = new Pair<>(true,"op");

        pair.getDescription();
        pair1.getDescription();

    }
}
