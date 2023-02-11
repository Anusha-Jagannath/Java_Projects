package exceptionHandler;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning exception handling");
        int a = 4;
        int b = 5;
        int c = 0;
        try {
           // c = a/0;
           // int arr[] = new int[5];
           // System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally I am here");
        }

        System.out.println(c);
        System.out.println("I am at the last part");

        //fun1();
    }

    static void fun1() throws ArithmeticException {
        int a = 2;
        int b = 0;
        int c = a/b;
        System.out.println(c);

        boolean isDanger = true;
        if (isDanger) {
            throw new ArithmeticException("Danger is here");
        }
    }
}
