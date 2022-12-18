package inheritance;

public class Player extends Person {

    public Player(String name) {
        super(name);
        System.out.println("Inside player constructor");
    }

    public void playing() {
        System.out.println(name+" Player is playing");
    }
}
