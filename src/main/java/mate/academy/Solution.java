package mate.academy;

public class Solution{

    public static String kata(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return String.valueOf(i);
            }
        }
        return "Not found";
    }

}