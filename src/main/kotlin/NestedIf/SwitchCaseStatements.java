package NestedIf;

public class SwitchCaseStatements {

    public static void main(String args[]) {
        System.out.println("Switch statements");
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("No match");

        }

        int ratings = 2;
        switch (ratings) {
            case 5:
                System.out.println("You earned 5 start..");
                break;

            case 4:
                System.out.println("Great going");
                break;

            case 3:
                System.out.println("You earned 3 star");
                break;

            case 2:
            case 1:
                System.out.println("You need to work hard");
                break;

            default:
                System.out.println("Invalid ratings");
                break;
        }
    }
}
