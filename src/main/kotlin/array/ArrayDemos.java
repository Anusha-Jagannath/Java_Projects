package array;

import java.util.Scanner;

public class ArrayDemos {

    public static void main(String args[]) {
        System.out.println("Learning the arrays");
        int marks[] = new int[5];
        System.out.println(marks[4]);
        int age[] = {12, 3, 4, 5, 6, 7};
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        age[3] = 7;
        System.out.println(age[3]);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of students");
        int n = scanner.nextInt();
        float mark[] = new float[n];
        float sum = 0;
        System.out.println("Enter marks of " + n + " students");
        for (int i = 0; i < n; i++) {
            mark[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += mark[i];
        }

        System.out.println("The sum is " + sum + "\n" + "The average is " + sum / n);

    }
}
