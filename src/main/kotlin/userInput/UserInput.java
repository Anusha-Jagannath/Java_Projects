package userInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        System.out.println("Using scanner files");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("The number is "+a);
        String name = sc1.nextLine();
        System.out.println("The name is "+name);
    }
}
