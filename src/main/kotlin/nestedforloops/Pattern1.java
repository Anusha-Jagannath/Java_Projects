package nestedforloops;

public class Pattern1 {

    public static void main(String args[]) {
        System.out.println("pattern1");
        int n = 5;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
