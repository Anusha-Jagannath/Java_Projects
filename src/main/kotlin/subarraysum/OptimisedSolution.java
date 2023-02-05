package subarraysum;

import java.util.HashSet;
import java.util.Set;

public class OptimisedSolution {

    public static void main(String args[]) {
        int ar[] = {1,2,-3,0,4,5,6};

        Set<Integer> set = new HashSet<>();

        int sum = 0;
        int k =2;
        boolean isFound = false;
        for(int element: ar) {
            sum = sum + element;
            set.add(sum);
            if (set.contains(sum-k)) {
                isFound = true;
                break;
            }
        }

        System.out.println("The founding is "+isFound);
    }
}
