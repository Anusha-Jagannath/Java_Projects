package priorityqueuedatas;

import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning priority queue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println(pq);
        pq.remove();
        pq.remove();

        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("apple");
        pq1.add("banana");
        pq1.add("jkl");
        pq1.add("manhj");

        pq1.remove();
        System.out.println(pq1);
        System.out.println(pq);


    }
}
