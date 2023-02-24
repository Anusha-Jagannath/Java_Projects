package subarray;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String args[]) {
        int arr[] = {2, 1, 3, 4, -2};
        boolean isFound = false;

        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int element : arr) {
            set.add(sum);
            sum += element;
            if (set.contains(sum)) {
                isFound = true;
                break;
            }
        }

       System.out.println(isFound);

    }
}
