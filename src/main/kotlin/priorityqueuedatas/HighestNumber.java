package priorityqueuedatas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class HighestNumber {

    public static void main(String args[]) {
        System.out.println("learning priority queue");
        int k=5;

        int arr[] = {5,3,1,2,3,6,7,8,9,8};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++) {
            pq.add(arr[i]);
        }

        for(int i=k;i<10;i++){
            if (pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq);

        ArrayList<Integer> ans = new ArrayList<>(pq);
        Collections.sort(ans,Collections.reverseOrder());
        System.out.println(ans);

    }
}
