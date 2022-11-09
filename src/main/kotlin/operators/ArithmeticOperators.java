package operators;

public class ArithmeticOperators {

    public static void main(String args[]) {
        System.out.println("Working on arithmetic operators");
        int num1 = 45;
        int num2 = 30;
        int sum = num1 + num2; //arithmetic operators
        System.out.println("The sum of two numbers is "+sum);

        //find square(a+b) = a*a + b*b + 2*a*b
        int a = 2;
        int b = 4;
        int result = a*a + b*b + 2*a*b;
        int actualResult = (a+b)*(a+b);
        System.out.println("The result is "+result);
        System.out.println("The actual result is "+actualResult);

        //modulo operator
        int dividend = 30;
        int quotient = 2;
        int remainder = dividend % quotient;
        System.out.println("The result is "+remainder);

        //increment operator
        int e = 5;
        int increment = e++;
        System.out.println(increment+" "+e);

    }
}
