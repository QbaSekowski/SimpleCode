package mate.academy;

public class FindOdd {
    public static int findIt(int[] a) {
        int result = 0;
        for (int n : a) {
            result ^= n;
        }
        return result;
    }
}