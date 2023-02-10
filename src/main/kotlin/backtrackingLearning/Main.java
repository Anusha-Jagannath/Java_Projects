package backtrackingLearning;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning backtracking");
        int a[][] = {{1, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1, 1}};

        int result = shortestPath(a, 0, 1, 3, 4);
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
        return shortestPath(a, i, j, x, y, visited);

    }

    private static boolean isValid(int a[][], int i, int j, boolean visited[][]) {
        int rows = a.length;
        int cols = a[0].length;
        return i >= 0 && j >= 0 && i < rows && j < cols && a[i][j] == 1 && !visited[i][j];
    }

    private static int shortestPath(int a[][], int i, int j, int x, int y, boolean visited[][]) {
        if (!isValid(a, i, j, visited)) return 10000000;
        if (i == x && j == y) return 0;
        visited[i][j] = true;

        int left = shortestPath(a, i, j - 1, x, y, visited) + 1;
        int right = shortestPath(a, i, j + 1, x, y, visited) + 1;
        int top = shortestPath(a, i - 1, j, x, y, visited) + 1;
        int bottom = shortestPath(a, i + 1, j, x, y, visited) + 1;

        visited[i][j] = false;

        return Math.min(Math.min(left, right), Math.min(top, bottom));


    }


}
