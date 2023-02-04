package subarrayLearn;

import java.util.HashSet;
import java.util.Set;

public class OptimisedLearn {

    public static void main(String args[]) {
        System.out.println("Learning optimised solution");
        int arr[] = {1,2,3,-6,8,4};

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int k = 9;
        boolean isFound = false;
        for(int element: arr) {
            sum = sum + element;
            set.add(sum);
            if (set.contains(sum-k)) {
                isFound = true;
                break;
            }
        }

        System.out.println("The sum is "+isFound);
    }
}
