package nestedforloops;

public class Pattern5 {
    public static void main(String args[]) {
        System.out.println("Pattern5");
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
