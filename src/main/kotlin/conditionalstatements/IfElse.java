package conditionalstatements;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("If else if statements");
        int number = 30;
        if (number < 10) {
            System.out.println("Number is less than 10");
        } else if (number > 10 && number < 20) {
            System.out.println("Number lies between 10 to 20");
        } else {
            System.out.println("Number is greater than 20");
        }

        int a = 5;
        int b = 4;
        int result = a > b ? a : b;
        System.out.println("The greater number is " + result);

    }
}
