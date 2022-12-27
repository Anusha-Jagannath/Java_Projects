package finalkeyword;

public class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void getDescription() {
        System.out.println("The student name is "+name+" The student rollno is "+rollNo);
    }
}
