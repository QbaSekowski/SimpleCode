package mate.academy;

public class StringScramble {

    public static String scramble(String str, int[] indices) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = str.charAt(i);
        }
        return new String(arr);
    }
}
