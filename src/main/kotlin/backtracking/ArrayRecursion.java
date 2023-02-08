package backtracking;

import java.util.ArrayList;

public class ArrayRecursion {

    public static void main(String args[]) {
        System.out.println("Learning back tracking");
        int a[] = {2,1,2,3,4,8};
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            sum = sum+a[i];
        }

        boolean isPossible = (sum&1) == 0;

    }

//    static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
//
//    }
}
