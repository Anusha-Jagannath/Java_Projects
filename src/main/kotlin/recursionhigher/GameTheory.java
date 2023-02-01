package recursionhigher;

public class GameTheory {

    public static void main(String args[]) {
        System.out.println("Learning game theory");
        int[] a = new int[]{1, 5, 7, 3, 2, 4};
        System.out.println(game(a,0, a.length-1));

    }

    private static int game(int ar[],int l,int r) {
        if (l+1 == r) {
            return Math.max(ar[l],ar[r]);
        }

        return Math.max(ar[l] + Math.min(game(ar,l+2,r),game(ar,l+1,r-1) ),
                ar[r] + Math.min(game(ar,l+1,r-1),game(ar,l,r-2))

                );
    }
}
