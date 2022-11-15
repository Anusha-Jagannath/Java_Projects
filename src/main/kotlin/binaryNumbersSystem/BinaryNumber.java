package binaryNumbersSystem;

public class BinaryNumber {

    public static void main(String[] args) {
        //decimal system
        /**
         * contains 10 digits
         * binary system 2 digits (0 or 1)
         * 124 decimal 
         * convert it to binary
         */
        int number1 = 4;
        int number2 = 6;
        int number3 = number1&number2;
        System.out.println("The result is "+number3);
        int number4 = number1|number2;
        System.out.println("The result is "+number4);
        int number5 = number1>>1;
        System.out.println("The result is "+number5);
        int number6 = number1<<1;
        System.out.println("The result is "+number6);
    }
}
