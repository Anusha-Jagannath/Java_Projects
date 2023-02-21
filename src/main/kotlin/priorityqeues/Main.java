package priorityqeues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning priority queue");
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Appuio");
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        int arr[] = {1,4,2,3,5,7,8,9,0,7};
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        int top = 5;
        for(int  i=0;i<5;i++) {
            pq1.add(arr[i]);
        }

        for(int i=top;i<10;i++) {
            if (pq1.peek() < arr[i]) {
                pq1.remove();
                pq1.add(arr[i]);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(pq1);
        Collections.sort(ans,Collections.reverseOrder());

        for(int x: ans) {
            System.out.println(x);
        }


    }
}
