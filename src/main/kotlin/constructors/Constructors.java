package constructors;

class Dog {
    String name;
    String breed;
    int legs;

    Dog(int legs) {
        this.legs = legs;
        System.out.println("Constructor ");
    }
    Dog(String name, String breed,int legs) {
        this.name = name;
        this.breed = breed;
        this.legs = legs;
    }
}
public class Constructors {

    public static void main(String[] args) {
        System.out.println("Learning constructors");
        Dog dog = new Dog(4);
        System.out.println("The dog has "+dog.legs);
        Dog dog2 = new Dog("qwer","husky",4);
        System.out.println("the dog has "+dog2.legs+" "+dog2.name+" "+dog2.breed);
    }
 }
