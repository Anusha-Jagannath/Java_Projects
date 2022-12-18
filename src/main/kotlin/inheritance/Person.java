package inheritance;

public class Person {

    public Person(String name) {
        this.name = name;
        System.out.println("Inside person constructor");
    }

    protected String name;

    public void walk() {
        System.out.println("person is walking");
    }

    public void sleep() {
        System.out.println("person is sleeping");
    }

    public void eating() {
        System.out.println("Person is eating");
    }
}
