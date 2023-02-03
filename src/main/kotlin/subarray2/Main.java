package subarray2;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning sub array problem");
        int arr[] = {1,2,3,-5};


        boolean isFound = false;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            isFound = false;
            for(int j=i;j<arr.length;j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println("The found is "+isFound);
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Not found");
        }

    }
}
