package mate.academy;

import java.util.Stack;

public class Kata {

    public static boolean validParentheses(String parenStr) {
        Stack<Character> stack = new Stack<>();
        for (char c : parenStr.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}