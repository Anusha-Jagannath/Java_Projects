package backtracking;

public class Main {

    public static void main(String args[]) {
        System.out.println("The shortest path in the maze");
        int arr[][] = {{1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 1}};
        int rows = arr.length;
        int cols = arr[0].length;
        boolean isVisited[][] = new boolean[rows][cols];
        int result = shortestPath(arr,0,0,3,4,isVisited);
        if (result >= 1000000) {
            System.out.println(result);
        } else {
            System.out.println("Not found");
        }
    }

    private static int shortestPath(int a[][], int i, int j, int x, int y) {
        int rows = a.length;
        int cols = a[0].length;

        boolean visited[][] = new boolean[rows][cols];

        return shortestPath(a, i, j, x, y,visited);

    }

    static boolean isValid(int a[][], int i, int j,boolean vis[][]) {
        int rows = a.length;
        int cols = a[0].length;
        return i >= 0 && j >= 0 && i < rows && j < cols && a[i][j] == 1 && !vis[i][j];
    }

    private static int shortestPath(int a[][], int i, int j, int x, int y, boolean visited[][]) {

        if (!isValid(a,i,j,visited)) return Integer.MAX_VALUE;

        if (i == x && j == y) {
            return 0;
        }

        visited[i][j] = true;

        int left = shortestPath(a, i,j-1,x,y,visited) + 1;
        int bottom = shortestPath(a,i+1,j,x,y,visited) + 1;
        int right = shortestPath(a,i,j+1,x,y,visited) + 1;
        int top = shortestPath(a,i-1,j,x,y,visited)+1;
        visited[i][j] = false;

        return Math.min(Math.min(left,bottom), Math.min(right,top));
    }
}
