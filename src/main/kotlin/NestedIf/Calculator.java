package NestedIf;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        float result = 0;
        System.out.println("Calculator program");
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the operation\n 1. Addition\n2. Subtraction\n3 Multiplication\n4. Division");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                result = firstNumber + secondNumber;
                break;

            case 2:
                result = firstNumber - secondNumber;
                break;

            case 3:
                result = firstNumber * secondNumber;
                break;

            case 4:
                result = firstNumber / secondNumber;
                break;

            default:
               System.out.println("Invalid operation");
        }
        System.out.println("The result is "+result);
    }
}
