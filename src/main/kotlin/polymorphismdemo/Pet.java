package polymorphismdemo;

public class Pet extends Animal {

    String name;

    @Override
    public void walk() {
        System.out.println("Pet is walking");
    }
}
