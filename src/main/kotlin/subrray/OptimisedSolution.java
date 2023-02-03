package subrray;

import java.util.HashSet;
import java.util.Set;

public class OptimisedSolution {

    public static void main(String args[]) {
        int array[] = {1,2,3,-1,-5};
        System.out.println("Learning solution for array sum");
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        boolean isFound = false;
        for(int element: array) {
            set.add(sum);
            sum = sum +element;
            if (set.contains(sum)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);

    }
}
