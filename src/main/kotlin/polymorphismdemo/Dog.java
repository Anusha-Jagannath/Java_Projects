package polymorphismdemo;

public class Dog extends Animal {

    String name;

    @Override
    public void walk() {
       System.out.println("Dog is walking");
    }
}
