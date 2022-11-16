package NestedIf;

public class NestedIf {

    public static void main(String args[]) {
        int x = 45;
        if (x>=1 && x<=100) {
            System.out.println("The number lies between 1 to 100");
        }

        int grade = 11;
        if (grade == 10 || grade == 12) {
            System.out.println("You can give board exams");
        } else {
            System.out.println("You cannot give board exams");
        }

        System.out.println("Nested if else");
        //greatest of three numbers
        int a = 2;
        int b = 3;
        int c = 4;
        if (a > b) {
            if (a > c) {
                System.out.println("greatest is "+a);
            } else {
                System.out.println("greatest is "+c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest is "+b);
            } else {
                System.out.println("Greatest is "+c);
            }
        }

        int result = a>b? a>c? a:c : b>c? b:c;
        System.out.println("the greatest number is "+result);
    }
}
