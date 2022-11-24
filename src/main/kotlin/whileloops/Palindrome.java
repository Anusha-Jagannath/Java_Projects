package whileloops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int temp = number;
        int reverseNumber = 0;
        while (temp!=0) {
            int remainder = temp%10;
            reverseNumber = reverseNumber*10+remainder;
            temp = temp/10;
        }
        System.out.println("reverse number is "+reverseNumber);
        if (number==reverseNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
