package Algorithm;

import java.util.Scanner;

public class TwoPointerAlgorithm {

    public static void main(String args[]) {
        System.out.println("Learning two pointer algorithm");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if (arr[i]+arr[j]+arr[k] == 0) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }

    }
}
