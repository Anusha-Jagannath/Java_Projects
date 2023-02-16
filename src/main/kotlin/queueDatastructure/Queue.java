package queueDatastructure;

import java.util.LinkedList;

public class Queue {

    public static void main(String args[]) {
        System.out.println("Learning queue data structure");

        java.util.Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.remove();
        queue.remove();
        System.out.println(queue);

    }
}
