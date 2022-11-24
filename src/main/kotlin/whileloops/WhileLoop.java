package whileloops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String args[]) {
        System.out.println("While loops learnings");
        System.out.println("Enter the digit");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println("The result is "+sum);

        //to find number of digit in a number
        int noOfDigit = (int) Math.log10(temp)+1;
        System.out.println(noOfDigit);

    }
}
