package recursion;

public class PowerOf {

    public static void main(String args[]) {
        System.out.println("Learning power of numbers using recursion");
        System.out.println(powerOf(2,3));
    }

    static int powerOf(int a,int b) {
        if (b == 0) {
            return 1;
        }
        return powerOf(a,b-1) * a;
    }

    static int fastPower(int a,int b) {
        if (b == 0) {
            return 1;
        }
        if (b%2 ==0) {
            return fastPower(a*a,b/2);
        } else {
            return a*fastPower(a,b-1);
        }
    }
}
