package setds;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning arrayList");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ArrayList fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("1");

        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(new Pair(1,"ty"));
        arr.add(new Pair("io",6));
        System.out.println(arr.get(0).x+" "+arr.get(0).y);
        arr.remove(0);

        String temp[] = new String[fruits.size()];
        fruits.toArray(temp);
        System.out.println(temp);




    }
}
