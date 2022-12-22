package findTriplets;

import java.util.Arrays;
import java.util.Scanner;

public class FindTriplets {

    public static void main(String[] args) {
        System.out.println("Finding triplets");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++) {
            findTwoSum(arr,-arr[i],i);
        }
    }

    private static boolean findTwoSum(int arr[], int x,int i) {
        int j=arr.length-1;

        while(i<j) {
            if (arr[i] + arr[j] < x) i++;
            else if(arr[i]+arr[j] > x) j--;
            else return true;
        }
        return false;
    }
}
