package subarray2;

import java.util.HashSet;
import java.util.Set;

public class OptimisedSolution {

    public static void main(String args[]) {
        System.out.println("Learning optimised solution for brute force");
        int arr[] = {1,2,3,-6};
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int k = 3;
        boolean isFound = false;
        for(int element: arr) {
            set.add(sum);
            sum = sum + element;
            if (set.contains(sum-k))
                isFound = true;
                break;
            }

            System.out.println(isFound);
        }

    }

