package encapsulation;

public class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("The age is greater than 20");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
