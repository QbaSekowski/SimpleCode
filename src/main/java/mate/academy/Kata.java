package mate.academy;

public class Kata {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = n * (i + 1);
        }
        return result;
    }
}