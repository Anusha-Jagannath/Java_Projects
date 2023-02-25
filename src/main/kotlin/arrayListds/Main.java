package arrayListds;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning  arraylist data structure");
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add("Hello");

        ArrayList<Pair> array = new ArrayList<>();
        array.add(new Pair("anusha",1));
        array.add(new Pair(1,"amith"));
        for (Pair pair: array) {
            System.out.println(pair.x+" "+pair.y);
        }

        ArrayList<String> ar = new ArrayList<>();
        ar.add("fgh");
        ar.add("klo");

        System.out.println(ar);
        String ar1[] = new String[ar.size()];
        ar.toArray(ar1);
        for (String e: ar1) {
            System.out.println(e);
        }
    }
}
