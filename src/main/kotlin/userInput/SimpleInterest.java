package userInput;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String args[]) {
        System.out.println("Calculating simple interest");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float principle = sc.nextFloat();
        System.out.println("Enter the time");
        float time = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        float rateOfInterest = sc.nextFloat();
        float simpleInterest = principle*time*rateOfInterest/100;
        System.out.println("The simple interest is "+simpleInterest);
    }
}
