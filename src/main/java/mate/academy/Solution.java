package mate.academy;

public class Solution {

    public static int signChange(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] * arr[i - 1] < 0 && arr[i] != 0) {
                    counter++;
            }
                if (arr[i] == 0 && arr[i - 1] < 0) {
                    counter++;
                }
        }
        return counter;
    }
}
