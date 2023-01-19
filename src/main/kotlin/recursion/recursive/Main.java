package recursion.recursive;

public class Main {

    static int steps = 0;
    static int fastSteps = 0;

    public static void main(String args[]) {
        System.out.println("Learning recursion in java");
        System.out.println(printName(10));
        System.out.println(sumOf(10));
        System.out.println(powerOf(3,6));
        System.out.println(steps);
        System.out.println(fastPowerOf(3,6));
        System.out.println(fastSteps);
        System.out.println(findPath(2,2));
    }

    static int printName(int n) {
        if (n == 1) {
            return 1;
        }
        return printName(n-1) + 1;
    }

    static int sumOf(int n) {
        if (n == 1) {
            return 1;
        }
        return sumOf(n-1) + n;
    }

    static int powerOf(int a,int b) {
        steps++;
        if (b == 0) {
            return 1;
        }
        return powerOf(a,b-1) * a;
    }
    static int fastPowerOf(int a,int b) {
        fastSteps++;
        if (b == 0) {
            return 1;
        }

        if (b%2==0) {
            return fastPowerOf(a*a,b/2);
        } else {
            return fastPowerOf(a*a,b/2)*a;
        }
    }
    static int findPath(int n,int m) {
        if (n==1 || m==1) {
            return 1;
        }
        return findPath(n,m-1) + findPath(m,n-1);
    }
}
