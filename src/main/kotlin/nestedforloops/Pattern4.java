package nestedforloops;

public class Pattern4 {
    public static void main(String args[]) {
        System.out.println("Pattern4");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
