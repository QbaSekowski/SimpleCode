package mate.academy;

import java.util.Stack;

public class Kata {
    public static String ArrayChallenge(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            if (idx >= strArr.length) continue;
            String val = strArr[idx];
            if (val.equals("#")) continue;
            if (sb.length() > 0) sb.append(" ");
            sb.append(val);
            int right = 2 * idx + 2;
            int left = 2 * idx + 1;
            stack.push(right);
            stack.push(left);
        }
        return sb.toString();
    }
}