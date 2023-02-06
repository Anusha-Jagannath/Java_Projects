package subarray3;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning zero sub array");
        int arr[] = {1,4,3,-1,-6};

        boolean isFound = false;
        for(int i=0;i< arr.length;i++) {
            int sum =0;
            for(int j=0;j<arr.length;j++) {
                sum = sum +arr[j];
                if (sum == 0) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        System.out.println("The found is "+isFound);
    }
}

