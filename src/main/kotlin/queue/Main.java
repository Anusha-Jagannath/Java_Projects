package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning queue data structure");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(14);
        queue.add(16);

        queue.remove();
        System.out.println(queue);
    }
}
