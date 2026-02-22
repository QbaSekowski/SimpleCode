package mate.academy;

public class Solution {
    public static int[] trouble(int[] x, int t) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j && x[i] + x[j] == t) {
                    int[] result = new int[x.length - 1];
                    int index = 0;

                    for (int k = 0; k < x.length; k++) {
                        if (k != j) {
                            result[index++] = x[k];
                        }
                    }
                    return result;
                }
            }
        }
        return x;
    }
}