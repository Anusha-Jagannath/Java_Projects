package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("polymorphism");
        Dog dog = new Dog();
        dog.walk();

        Pet pet = new Pet();
        pet.walk();

        greetings();
        greetings("Hi");
        greetings("Hjk",2);

        System.out.println(dog.name);
    }

    public static void greetings() {
        System.out.println("Hi");
    }

    public static void greetings(String greet) {
        System.out.println(greet);
    }

    public static void greetings(String greet, int count) {

        for(int i=0;i<count;i++) {
            System.out.println("Hello");
        }
    }
}
