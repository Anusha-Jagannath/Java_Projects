package exceptions;


public class Main {

    public static void main(String args[]) {
        System.out.println("Handling exceptions");
        try {
            int a = 2;
            int b=3;
            int c=a/b;
            System.out.println(c);

            int arr[] = new int[6];
            arr[6] = 3;
        }  catch (ArithmeticException exception) {
            exception.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } catch (IllegalArgumentException exception) {
            System.out.println("illegal argument exception");
        }  finally {
            System.out.println("finally i am here");
        }

        try {
            Thread.sleep(3000);
            System.out.println("I am here");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Running important code");
        System.out.println("Needing to run");
    }
 }
