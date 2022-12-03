package oops;


class Cat {
    boolean hasFur;
    int eyes, legs;
    String color, breed;

    public void walk() {
        System.out.println("The cat is walking");
    }

    public void eat() {
        System.out.println("The cat is eating");
    }

    public void description() {
        System.out.println("My cat has legs "+legs+" eyes"+eyes);
    }
}

class Dog {
    String breed, color;

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void walk() {
        System.out.println("Dog is walking");
    }

    public void description() {
        System.out.println("My dog breed is "+breed);
        System.out.println("My dog color is "+color);
    }
}

public class ClassAndObject {

    public static void main(String args[]) {
        /**
         * class is a blueprint for the creation of object
         * class dont take any memory
         * it is a logical entity which doesnot exists
         *
         * object is a real world entity eg cat,dog,white board, mac laptop
         * object it has a memory
         */
        Cat cat = new Cat();
        cat.hasFur = true;
        cat.eyes = 2;
        cat.legs = 4;
        cat.color = "black";
        cat.breed = "indian";

        cat.walk();
        cat.eat();
        cat.description();

        Dog dog1 = new Dog();
        dog1.breed="Indian";
        dog1.color="black";
        dog1.eat();
        dog1.walk();
        dog1.description();
    }
}
