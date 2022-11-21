package loops;

public class SeriesSum2 {
    public static void main(String args[]) {
        float n = 10;
        float result = 0;
        for (float i=1;i<=n;i++) {
           if (i%2==0) {
               result -= 1/i;
           } else {
               result += 1/i;
           }
        }
        System.out.println("The result is "+result);
    }
}
