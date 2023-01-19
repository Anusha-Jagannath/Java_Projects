package recursion;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning recursion in java");
        //calling a function itself is called recursion
        printName(10);
    }

    static void printName(int n) {
        if (n==0) {
            return;
        }
        System.out.println("Anuj");
        printName(n-1);
        int resultSum = printSum(6);
        System.out.println(resultSum);
    }

    static int printSum(int n) {
        if (n == 1) {
            return 1;
        }
        int count = printSum(n-1) + 1;
        return count;
    }
}

