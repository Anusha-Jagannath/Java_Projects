package interfaces;

public class Person implements Student, Youtuber {

    public static void main(String args[]) {
        Person p = new Person();
        p.study();
        p.makeVideo();
    }

    @Override
    public void study() {
        System.out.println("The person is studying");
    }

    @Override
    public void makeVideo() {
        System.out.println("The person is making videos");
    }
}
