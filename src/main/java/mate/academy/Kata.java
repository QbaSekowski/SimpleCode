package mate.academy;

import java.util.Stack;

public class Kata {

    public static boolean validParentheses(String parenStr) {
        Stack<Character> stack = new Stack<>();
        for (char c : parenStr.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            if (c == ')' && stack.isEmpty()) return false;
        }
        return stack.isEmpty();
    }
}