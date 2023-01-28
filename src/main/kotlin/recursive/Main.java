package recursive;

public class Main {

    static int count = 0;

    public static void main(String args[]) {

        System.out.println("Learning recursion");
        //printName(10);
        //System.out.println(10);
        //System.out.println(sumOf(10));
        //System.out.println(powerOf(2,10));
        //System.out.println(count);
        System.out.println(optimizedPowerOf(2,7));
    }

    private static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Anuj");
        printName(n-1);
    }

    private static int countStick(int n) {
        if (n == 1) {
            return 1;
        }
        return countStick(n-1) + 1;
    }

    private static int sumOf(int n) {
        if (n==1) {
            return 1;
        }

        return sumOf(n-1) + n;
    }

    private static int powerOf(int a,int b) {
        count ++;
        if (b == 0) {
            return 1;
        }

        return powerOf(a,b-1) * a;
    }

    private static int optimizedPowerOf(int a,int b) {

        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
           return optimizedPowerOf(a*a,b/2);
        } else {
           return a * optimizedPowerOf(a*a,b/2);
        }
    }
}
