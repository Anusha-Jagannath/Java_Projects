package methods;

public class Methods {

    public static void main(String args[]) {
        System.out.println("Learning methods in java");

        //method is used to make your code DRY (Don't repeat yourself)

        int max = maxOf(3,4);
        System.out.println("The maximum number is "+max);

    }

    private static int maxOf(int a,int b) {
        if (a>b) return a; else return b;
    }
}
