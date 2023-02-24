package subarray;

public class Main {

    public static void main(String args[]) {
        int ar[] = {2,1,-3,4,2};
        boolean isFound = false;
        for(int i=0;i<ar.length;i++) {
            int sum = 0;
            for(int j=i;j<ar.length;j++) {
                sum+=ar[j];
                if (sum == 0) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        System.out.println(isFound);
    }
}
