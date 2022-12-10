package encapsulation;

public class AccessSpecifier {

    public static void main(String[] args) {
        System.out.println("Learning encapsulation");
        Student student = new Student();
        student.setName("ou");
        student.setAge(21);
        System.out.println(student.getAge());
    }
}
