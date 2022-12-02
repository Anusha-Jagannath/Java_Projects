package array.gfg;

import java.util.ArrayList;

public class LeaderArray {

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean leader=false;

        for (int i=0;i<n-1;i++) {
            leader=true;
            for(int j=i+1;j<n;j++) {
                if (arr[i]<arr[j]) {
                    leader=false;
                }
            }
            if(leader) {
                result.add(arr[i]);
            }
        }
        result.add(arr[n-1]);

        for (int e: result) {
            System.out.println(e);
        }
    }
}
