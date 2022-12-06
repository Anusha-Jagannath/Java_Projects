package methods;

public class PassByValue {

    public static void main(String[] args) {
        System.out.println("Pass by Value");
        int a=2;
        int b=3;
        swap(2,3);
        System.out.println("The number is "+a);
        System.out.println("The number is "+b);

        Dog a1 = new Dog();
        Dog b1 = new Dog();
        a1.legs = 2;
        b1.legs = 3;
        swap(a,b);
        System.out.println(a1.legs+" "+b1.legs);

        Dog newDog = new Dog();
        newDog.legs=2;
        change(newDog);
        System.out.println(newDog.legs);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void change(Dog d) {
        d.legs = 3;
    }

    static void swap(Dog a,Dog b) {
        Dog temp = a;
        a=b;
        b=temp;
    }
}

class Dog {
    int legs;
}
