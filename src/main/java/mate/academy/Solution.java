package mate.academy;

public class Solution {

    public static String camelCase(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                array[i] = array[i].substring(0, 1).toUpperCase()
                        + array[i].substring(1).toLowerCase();
            }
        }
        return String.join("", array);
    }

}
