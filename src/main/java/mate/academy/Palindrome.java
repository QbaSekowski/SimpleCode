package mate.academy;

public class Palindrome {
    public static Boolean isPalindrome(String x) {
        String reversed = new StringBuilder(x).reverse().toString();
        return x.equalsIgnoreCase(reversed);
    }
}