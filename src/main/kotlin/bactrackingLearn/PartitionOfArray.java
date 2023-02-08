package bactrackingLearn;

import java.util.ArrayList;

public class PartitionOfArray {

    public static void main(String args[]) {
        System.out.println("Array partition");
        int a[] = {2,1,2,3,4,8};
        int sum = 0;

        for(int i=0;i<a.length;i++) {
            sum = sum + a[i];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        boolean isPossible = (sum&1) == 0 && partition(a,sum/2,0,ans);



    }

    static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans) {
        if (i >= a.length || sum <0) return false;
        if (sum == 0) return true;
        ans.add(a[i]);
        boolean leftPossible = partition(a,sum-a[i],i+1,ans);

        if (leftPossible) return true;

        //this makes back tracking
        ans.remove(ans.size() - 1);


        return partition(a,sum,i+1,ans);
    }
}
