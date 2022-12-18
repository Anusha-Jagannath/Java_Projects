package inheritance;

public class Main {

    public static void main(String args[]) {
        Singer singer = new Singer("Mr ANu");
        singer.eating();
        singer.sing();
        singer.walk();

        Teacher teacher = new Teacher("Mr Moolin");
        teacher.eating();
        teacher.teach();
        teacher.walk();

        Player player = new Player("Mr Playoo");
        player.eating();
        player.walk();
        player.playing();

        //Person person = new Person();

        System.out.println(teacher instanceof Teacher);
        System.out.println(singer instanceof Singer);
        System.out.println(player instanceof Player);
        System.out.println(teacher instanceof Person);
        //System.out.println(person instanceof Teacher);
    }
}
