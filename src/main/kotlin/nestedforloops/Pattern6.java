package nestedforloops;

public class Pattern6 {

    public static void main(String args[]) {
        System.out.println("Pattern6");
        int n =5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
