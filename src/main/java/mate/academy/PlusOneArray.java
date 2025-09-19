package mate.academy;

public class PlusOneArray {
    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        for (int digit : arr) {
            if (digit < 0 || digit > 9) {
                return null;
            }
        }
        int[] result = arr.clone();
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] < 9) {
                result[i]++;
                return result;
            }
            result[i] = 0;
        }
        int[] extended = new int[result.length + 1];
        extended[0] = 1;
        return extended;
    }
}
