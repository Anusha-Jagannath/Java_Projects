package linkedlistcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning linked list");
        /**
         * array list is used when element is added at the end
         * traversing is impt
         *
         * linked list is used when element is added at the middle where shifting is not used
         * traversing takes time here
         * linkedlist has data and address part
         * first element is head
         */

        List<Integer> list1 = new LinkedList();
        List<Integer> list2 = new ArrayList();
        getTimeInMillis(list1);
        getTimeInMillis(list2);
        MyLinkedList<String> list = new MyLinkedList();
        for(int i=0;i<9;i++) {
            list.add(i+"added");
        }
        list.display();

    }

    private static void getTimeInMillis(List<Integer> l) {

        Long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++) {
            //l.add(i);
            l.add(0,i);
        }

        Long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
