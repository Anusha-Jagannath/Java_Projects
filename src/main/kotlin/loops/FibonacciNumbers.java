package loops;

public class FibonacciNumbers {

    public static void main(String args[]) {
        int number = 1000;
        //printFibonacciNumbers(number);
        findXRaisedToY(2,3);
    }

    private static void printFibonacciNumbers(int number) {
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1 + "\n" + f2);

        for (int i = 2; i < number; i++) {
            int f3 = f1 + f2;
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
        }
    }

    private static void findXRaisedToY(int x, int y) {
        int result = 1;
        for (int i=1;i<=y;i++) {
            result = result*x;
        }
        System.out.println("The result is "+result);
    }
}
