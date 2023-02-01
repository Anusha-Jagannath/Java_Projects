package advancedrecursion;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning flood fill algorithm");
        int a[][] = new int[][]{
                {1,2,2,0,1,3},
                {1,2,2,2,1,3},
                {1,2,2,1,1,3},
                {1,1,2,2,2,3}
        };

        floodFill(a,2,2,3,2);
        printMatrix(a);
    }

    private static void printMatrix(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void floodFill(int a[][],int r,int c,int toFill,int prevFill) {
        int rows = a.length;
        int cols = a[0].length;

        if (r<0 || r>=rows || c<0 || c>=cols) {
            return;
        }

        if (a[r][c] != prevFill) {
            return;
        }

        a[r][c] = toFill;

        floodFill(a,r-1,c,toFill,prevFill);
        floodFill(a,r+1,c,toFill,prevFill);
        floodFill(a,r,c-1,toFill,prevFill);
        floodFill(a,r,c+1,toFill,prevFill);


    }
}
