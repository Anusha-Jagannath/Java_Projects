package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq1.add(a[i]);
            } else {
                if (pq1.peek() < a[i]) {
                    pq1.poll();
                    pq1.add(a[i]);
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>(pq1);
        Collections.sort(result, Collections.reverseOrder());

        for (Integer x : result) {
            System.out.println(x);
        }

    }
}
