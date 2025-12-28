package mate.academy;

public class JomoPipi {

    public static char[][] shift(char[][] m, int n) {
        int total = m.length * m[0].length;
        for (int k = 0; k < n % total; k++) {
            char prev = m[m.length - 1][m[0].length - 1];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    char temp = m[i][j];
                    m[i][j] = prev;
                    prev = temp;
                }
            }
        }
        return m;
    }
}