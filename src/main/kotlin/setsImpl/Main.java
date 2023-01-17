package setsImpl;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        System.out.println("Learning sets");
        //hash code and equals
        Pen p1 = new Pen(10,"blue");
        Pen p2 = new Pen(20,"blue");

        System.out.println(p1 == p2);

        Set<Pen> s = new HashSet();
        s.add(p1);
        s.add(p2);

    }
}

class Pen {
    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        Pen p = (Pen) obj;
        if (this.price == p.price && this.color.equals(p.color)) {
            isEqual = true;
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return price+color.hashCode();
    }

}
