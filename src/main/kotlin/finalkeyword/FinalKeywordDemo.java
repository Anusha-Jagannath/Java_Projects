package finalkeyword;

public class FinalKeywordDemo {

    private static final String NAME = "Anuj";
    public static void main(String args[]) {
        System.out.println("Learning final keyword");
        Student student = new Student("fgh",2);
        Student student2 = new Student("jkl",3);
        student = student2;
        student.getDescription();
    }
}
