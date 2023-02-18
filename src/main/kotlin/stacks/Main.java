package stacks;

import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning stacks and vectors");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int popped = stack.pop();
        System.out.println(popped);

    }
}
