package array;

import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String args[]) {
        System.out.println("Learning multidimensional array");
        int rows;
        int columns;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns");
        rows = scanner.nextInt();
        columns = scanner.nextInt();
        int a[][] = new int[rows][columns];
        int b[][] = new int[rows][columns];
        int c[][] = new int[rows][columns];

        System.out.println("Enter matrix1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter matrix2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("matrix1 is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matrix2 is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
