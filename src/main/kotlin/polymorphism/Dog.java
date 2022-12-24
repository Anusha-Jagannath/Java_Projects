package polymorphism;

public class Dog extends Pet{

    String name = "Dogg";

    @Override
    public void walk() {
        System.out.println("Dog is walk");
    }
}
