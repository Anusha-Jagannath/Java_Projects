package whileloops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String args[]) {
        System.out.println("Learning do while loop");
        int n=0;
        do {
            System.out.println("The value of n "+n);
        }while (n!=0);

        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the number");
            num = sc.nextInt();
        }while (num>0);

    }
}
