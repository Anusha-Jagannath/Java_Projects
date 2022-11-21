package loops;

import java.util.Scanner;

public class Break {

    public static void main(String args[]) {
        System.out.println("Learning break statements");
        for (int i=0;i<100;i++) {
            if (i == 35)
                break;
            System.out.println(i);
        }

        //take user inout until user inputs negative number
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            if (number<0)
                break;
        }
    }
}
