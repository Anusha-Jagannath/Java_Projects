package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning linked list");
        //to find arraylist is easy
        //to search linked list is easy

        List<Integer> ll = new LinkedList<>();
        List<Integer> llA = new ArrayList<>();
        getTime(ll);
        getTime(llA);
    }

    private static void getTime(List<Integer> ll) {

        long start = System.currentTimeMillis();

        for(int i=0;i<100000;i++) {
            ll.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("The time in milli second is "+ll.getClass()+(start-end));

    }
}
