package mate.academy;

class Solution {
    public static String solve(String s, int a, int b){
        b = Math.min(b, s.length() - 1);
        return s.substring(0, a)
                + new StringBuilder(s.substring(a, b + 1)).reverse()
                + s.substring(b + 1);
    }
}