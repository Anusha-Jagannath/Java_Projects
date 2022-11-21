package loops;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 10;
        if (checkPrimeNumbers(49)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime numbers");
        }
    }

    private static boolean checkPrimeNumbers(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
