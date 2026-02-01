package mate.academy;

public class Solution {
    public static String solve(final String str) {
        char[] chars = str.toCharArray();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount > lowerCaseCount) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }
}