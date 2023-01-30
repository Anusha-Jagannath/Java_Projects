package recursionpart;

public class FloodFill {

    public static void main(String args[]) {
        System.out.println("Learning flood fill algorithm");
        int a[][] = new int[][]{
                {1,2,0,1,1},
                {1,2,0,1,1},
                {1,2,0,1,1},
                {1,2,2,1,1}
        };

        floodFill(a,2,2,3,2);

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void floodFill(int a[][], int r, int c, int toFill, int prevKey) {
        int rows = a.length;
        int cols = a[0].length;

        if (r<0 || r>rows || c<0 || c>cols) {
            return;
        }

        if (a[r][r] != prevKey) {
            return;
        }

        a[r][c] = toFill;

        floodFill(a,r-1,c,toFill,prevKey);
        floodFill(a,r+1,c,toFill,prevKey);
        floodFill(a,r,c-1,toFill,prevKey);
        floodFill(a,r,c+1,toFill,prevKey);
    }
}
