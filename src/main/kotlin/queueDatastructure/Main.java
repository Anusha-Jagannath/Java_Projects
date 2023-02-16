package queueDatastructure;

import java.util.Stack;

public class Main {

    public static void main(String args[]) {
        System.out.println("Learning queue data structure");

        Stack<Character> stack = new Stack();
        String s = ")";
        boolean isBalanced =true;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if (pushToStack(c)) {
                stack.add(c);
            }

            else {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                if (popFromStack(stack.peek(),c)) {
                    stack.pop();
                }
                else {
                    isBalanced = false;
                    break;
                }
            }




        }

        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        System.out.println(isBalanced);
    }

    private static boolean pushToStack(char ch) {
        return ch == '{' || ch == '[' || ch == '(';
    }

    private static boolean popFromStack(char first,char second) {

        return (first == '(' && second == ')'
        || first == '{' && second == '}'
          || first == '[' && second == ']'
        );
    }
}
