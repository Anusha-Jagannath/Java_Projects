package subarrayLearn;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning sub array");
        int arr[] = {1,2,3,-5,6};
        boolean isFound = false;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i;j<arr.length;j++) {
                sum = sum + arr[j];
                if (sum == 0){
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
