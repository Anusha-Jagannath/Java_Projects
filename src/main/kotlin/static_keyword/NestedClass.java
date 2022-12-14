package static_keyword;

public class NestedClass {

    static class A {

    }
    class B {

    }

    public static void main(String args[]) {
        NestedClass nested = new NestedClass();
        B b = nested.new B();

        A a = new NestedClass.A();
    }
}
