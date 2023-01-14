package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning linked list");
        List list = new LinkedList<Integer>();
        getTimeDifference(list);


        List list2 = new ArrayList<Integer>();
        getTimeDifference(list2);

    }

    private static void getTimeDifference(List list2) {
        Long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++)
        list2.add(0,i);
        Long end = System.currentTimeMillis();
        Long diffTime = start - end;
        System.out.println(diffTime);

    }
}
