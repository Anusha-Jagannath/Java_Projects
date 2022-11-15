package conditionalstatements;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        System.out.println("Learning conditional statements");
        System.out.println("Enter the age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can vote now");
        } else {
            System.out.println("Go and play..You can't vote now");
        }
    }
}
