package inheritance;

public class Singer extends Person {

    public Singer(String name) {
        super(name);
        System.out.println("Inside singer constructo");
    }

    public void sing() {
        System.out.println("Person is singing");
    }

    public void eating() {
        System.out.println(name+" Singer is singing");
    }
}
