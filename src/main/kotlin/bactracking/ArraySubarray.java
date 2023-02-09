package bactracking;

import java.util.ArrayList;

public class ArraySubarray {

    public static void main(String args[]) {
        System.out.println("Learning array sub array problem");

        int a[] = {2, 1, 2, 3, 4, 8};
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        boolean isBoolean = (sum & 1) == 0 && partition(a,sum/2,0,ans);
        if (isBoolean) {
            for(int e: ans) {
                System.out.println(e+" ");
            }
        } else {
            System.out.println("Not possible");
        }

    }

    static boolean partition(int a[],int sum, int i, ArrayList<Integer> ans) {
        if (i >= a.length || sum < 0) return false;
        ans.add(a[i]);
        boolean leftPossible = partition(a,sum-a[i],i+1,ans);
        if (leftPossible) return true;
        ans.remove(ans.size()-1);
        return partition(a,sum,i+1,ans);

    }

}
