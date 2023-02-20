package stackds;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String args[]) {
        String s = "(({}))";
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isPush(ch)) {
                stack.add(ch);
            } else {

                 if (stack.isEmpty()) {
                     isBalanced = false;
                 }
                else if (!isPop(stack.peek(), ch)) {
                    isBalanced = false;
                    break;

                } else {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            isBalanced = true;
        }

        System.out.println(isBalanced);

    }

    private static boolean isPush(char ch) {
        if (ch == '(' || ch == '{' || ch == '[') return true;
        else return false;
    }

    private static boolean isPop(char first, char second) {
        return (first == '(' && second == ')' ||
                first == '{' && second == '}' ||
                first == '[' && second == ']'
        );
    }
}
