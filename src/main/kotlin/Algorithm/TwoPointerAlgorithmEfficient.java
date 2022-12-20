package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerAlgorithmEfficient {

    public static void main(String args[]) {
        System.out.println("Learning two pointer algorithm");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int k=n-1;
            while(j<k) {
                if(arr[i]+arr[j]+arr[k]==0){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
    }
}
