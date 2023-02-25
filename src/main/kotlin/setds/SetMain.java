package setds;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String args[]) {
        System.out.println("Learning set data structure");
        int arr[] = {1,2,-3,4,5,6};
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean isFound = false;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            set.add(sum);
            if (set.contains(sum)) {
                isFound = true;
                break;
            }
        }

        System.out.println(isFound);
    }
}
