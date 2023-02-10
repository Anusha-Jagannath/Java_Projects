package backtrackingLearning;

import java.util.ArrayList;

public class SubArrayMain {

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum +arr[i];
        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        boolean isPossible = (sum & 1) == 0 && partition(arr,sum/2,0,res);

        if (isPossible) {
            for(int element: res) {
                System.out.print(element);
            }
        } else {
            System.out.println("Not possible");
        }
    }

    static boolean partition(int a[],int sum,int i, ArrayList<Integer> ans) {
        if (i >= a.length || sum < 0) return false;

        if (sum == 0) return true;
        ans.add(a[i]);
        boolean leftPossible = partition(a,sum-a[i],i+1,ans);
        if (leftPossible) return true;

        //this makes backtracking possible
        ans.remove(ans.size()-1);
        return false;

    }
}
