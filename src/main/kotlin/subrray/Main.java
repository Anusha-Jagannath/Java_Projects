package subrray;

/**
 * Given a array find the sub array whose sum is equal to zero
 */

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning sub array problem");

        int array[] = {1,2,-2,4,-4,5};
        boolean isFound = false;
        for(int i=0;i<array.length;i++) {
            isFound = false;
            int sum = 0;
            for(int j=i+1;j<array.length;j++) {
                sum = array[i]+array[j];
                if (sum == 0) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println("Found");
            }
        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }
}
