package recursionpart2;

public class CoinProblem {

    public static void main(String args[]) {
        System.out.println("learning flood fill aglorithm");


    }

    private static int coinMax(int ar[], int l,int r) {
        if (l+1 == r) {
            return Math.max(ar[l],ar[r]);
        }

        return Math.max(ar[l] + Math.min(coinMax(ar,l+2,r), coinMax(ar,l+1,r-1)),
                ar[r] + Math.min(coinMax(ar,l+1,r-1), coinMax(ar,l,r-2))
                );
    }
}
