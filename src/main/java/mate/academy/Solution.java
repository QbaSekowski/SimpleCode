package mate.academy;

public class Solution {
    public static String shortenToDate(String longDate) {
        int comaIndex = longDate.indexOf(",");
        return longDate.substring(0,comaIndex);
    }
}