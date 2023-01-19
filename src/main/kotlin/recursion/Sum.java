package recursion;

public class Sum {

    public static void main(String args[]) {
        System.out.println("Learning sum of first natural numbers using recursion");
        System.out.println(sumOf(6));
    }

    static int sumOf(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = sumOf(n-1)+n;
        return sum;
    }
}
