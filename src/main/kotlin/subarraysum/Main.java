package subarraysum;

public class Main {
    public static void main(String args[]) {

        int arr[] = {3,4,-1,4,3,-6,-7,2};

        boolean isFound = false;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=0;j<arr.length;j++) {
                sum = sum + arr[j];
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
