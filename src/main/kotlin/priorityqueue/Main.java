package priorityqueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]) {
        System.out.println("learning priority queue");
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("kiwi");
        pq.add("apple");
        pq.add("banana");
        System.out.println(pq);
        System.out.println(
                pq.remove()
        );
        System.out.println(pq.remove());

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.add(20);
        pq1.add(15);
        pq1.add(18);
        pq1.add(30);
        System.out.println(pq1);

        System.out.println(pq1.remove());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(10);
        pq2.add(20);
        pq2.add(5);
        pq2.add(4);

        System.out.println(pq2.remove());
        System.out.println(pq2.remove());
    }
}
