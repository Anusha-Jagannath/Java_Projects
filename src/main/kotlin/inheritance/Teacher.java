package inheritance;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
        System.out.println("Inside teacher constructor");
    }

    public void teach() {
        System.out.println(name+" Teacher is teaching");
    }
}
