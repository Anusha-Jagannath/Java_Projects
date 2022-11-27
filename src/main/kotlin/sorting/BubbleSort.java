package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String args[]) {
        System.out.println("Learning bubble sort");
        System.out.println("Enter the number of elements");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the number of elements");
        int a[] = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-1-i;j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Elements are");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}
