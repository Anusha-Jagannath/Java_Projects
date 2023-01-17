package setsImpl.hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning hashcode");
        Pen p1 = new Pen(1,"blue");
        Pen p2 = new Pen(1,"blue");
        Set<Pen> s = new HashSet<>();
        s.add(p1);
        s.add(p2);
        System.out.println(s);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
