package polymorphismdemo;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning polymorphism");
        Dog dog = new Dog();
        dog.walk();
        dog.name = "Mr dog";

        Pet pet = new Pet();
        pet.name = "Mr pet";


        greetings();
        greetings("hi");
        greetings("hi",2);
    }

    private static void greetings() {
        System.out.println("Hi");
    }

    private static void greetings(String greet) {
        System.out.println(greet);
    }

    private static void greetings(String greet, int count) {
        System.out.println(greet+" "+count);
    }
}
