package accessmodifiers;

import accessmodifiers.subpackage.Student;
import accessmodifiers.subpackage.Teacher;

public class AccessModifiers {

    public static void main(String args[]) {
        System.out.println("Access specifiers");
        Student student = new Student("Geeks");
        System.out.println(student.getName());

        Teacher teacher = new Teacher("MyTeacher");
        System.out.println(teacher.getName());
        // Java supports
        //private - can be accessed only inside the package
        //default - can be accessed within the class and within the package
        //protected - can be accessed within class and child class
        //public - can be accessed anywhere

    }
}
