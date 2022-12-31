package exceptionhandling;

public class Exception {

    public static void main(String args[]) {
        System.out.println("Leaning exception handling in java");

        try {
            int a = 4;
            int b=5;
            int c = a/b;
            System.out.println(c);

            int arr[] = new int[5];
            arr[6] = 7;
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        catch (IllegalArgumentException exception) {
            System.out.println("illegal argument exception");
        }

        finally {
            System.out.println("Always will run the code");
        }

        System.out.println("Very impt code");
        System.out.println("Needs to run");

        fun1();
    }

    static void fun1() {
        int a = 2;
        int b=5;
        int c=a/b;
        System.out.println(c);

        boolean isDanger = true;
        if (isDanger) {
            System.out.println("Danger");
            throw new ArrayIndexOutOfBoundsException("Danger was coming");
        }
    }
}
