package conditionalstatements;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        System.out.println("Enter the no of hours");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        if (hours % 2 == 0) {
            System.out.println("He works hard");
        } else {
            System.out.println("He doesnot work hard");
        }
    }
}
