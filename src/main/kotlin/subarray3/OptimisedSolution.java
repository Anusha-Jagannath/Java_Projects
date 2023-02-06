package subarray3;

import java.util.HashSet;
import java.util.Set;

public class OptimisedSolution {

    public static void main(String args[]) {
        System.out.println("learning sub array problem");

        int arr[] = {1,2,3,-6};
        int k = 5;

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean isFound = false;
        for(int element: arr) {
           sum = sum + element;
           set.add(sum);
           if (set.contains(sum-k)) {
               isFound = true;
           }
        }

        System.out.println("The found is "+isFound);
    }
}
