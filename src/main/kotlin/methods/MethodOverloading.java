package methods;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Method overloading");
        sumOf(2,3);
        sumOf(2.3f,3.0f);
    }

    static void sumOf(int a, int b) {
        System.out.println("The sum is "+a+b);
    }

    static void sumOf(float c, float d) {
        System.out.println("The sum is "+c+d);
    }
}
