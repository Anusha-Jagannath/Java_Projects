package advancedrecursion;

public class GameTheory {

    public static void main(String args[]) {
        System.out.println("Learning game theory");
    }

    static int coinMax(int a[],int l,int r) {
       if (l == r) {
           return Math.max(a[l],a[r]);
       }

       return Math.max(a[l] + Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),
               a[r] + Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2))
               );
    }


}
