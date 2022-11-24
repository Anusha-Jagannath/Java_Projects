package nestedforloops;

public class Pattern8 {

    public static void main(String[] args) {
        System.out.println("Pattern8");
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n-1;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
