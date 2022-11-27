package sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        System.out.println("Learning selection sort");
        int n;
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min;

        for (int i = 0; i < n; i++) {
            min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
