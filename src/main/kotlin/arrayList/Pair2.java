package arrayList;

public class Pair2<X,Y> {

    X x;
    Y y;


    public Pair2(X x, Y y) {
        this.x = x;
        this.y = y;

    }

    public void getDescription() {
        System.out.println(x+" "+y);
    }
}
