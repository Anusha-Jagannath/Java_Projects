package findThreeTriplets;

import java.util.Scanner;

public class FindTripl {

    public static void main(String args[]) {
        System.out.println("Three pointer algorithm");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-2;i++) {
            System.out.println(findTwoSum(arr,-arr[i],i));
        }
    }

    public static boolean findTwoSum(int arr[], int x, int i) {
        int j=arr.length-1;

        while(i<j) {
            if (arr[i]+arr[j] <x) i++;
            else if(arr[i]+arr[j] > x) j--;

            else return true;
        }
        return false;
    }
}
