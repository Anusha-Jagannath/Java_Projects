package loops;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Loops in java");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello " + i);
        }

        //print even numbers between 0 and 100
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        //print sum of 1 to 100
        int sum = 0;
        int n = 50;
        for (int k = 1; k <= 50; k++) {
            sum = sum + k;
        }
        System.out.println("The sum is " + sum);

        //print numbers from 100 to 1
        System.out.println("Print the numbers in reverse format");
        for (int l = 100; l >= 0; l--) {
            System.out.println(l);
        }

        //print table of 2
        System.out.println("Table of 2 is");
        int tableOf = 2;
        for (int i = 1; i<=20;i++) {
            System.out.println(tableOf+" * "+i+" = "+tableOf*i);
        }

        //print factorial of a number
        int number = 4;
        int fact = 1;
        for (int i = 1;i<=number;i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of a number is "+fact);
    }
}
