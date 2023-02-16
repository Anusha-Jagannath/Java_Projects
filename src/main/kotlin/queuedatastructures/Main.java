package queuedatastructures;

import java.util.Stack;

public class Main {

    public static void main(String args[]) {
        String s = "{()}]";
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (addTo(ch)) {
                stack.push(ch);
            }
              else if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
               else if (removeFrom(stack.peek(),ch)) {
                    stack.pop();
                } else {
                    balanced = false;
                    break;
                }

        }

        if (stack.isEmpty()) {
            balanced = true;
        }
        System.out.println(balanced);

    }

    private static boolean addTo(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean removeFrom(char first,char second) {

        return(first == '(' && second == ')' ||
                first == '{' && second == '}' ||
                first == '[' && second == ']'
                );
    }
 }
