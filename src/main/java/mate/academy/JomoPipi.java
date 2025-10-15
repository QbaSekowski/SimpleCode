package mate.academy;

public class JomoPipi {

    public static String jumbledString(String s, long n) {
        if (s.length() <= 1 || n == 0) return s;
        String original = s;
        int cycleLength = 0;
        do {
            s = mixLetters(s);
            cycleLength++;
        } while (!s.equals(original));

        long effectiveN = n % cycleLength;
        s = original;
        for (long i = 0; i < effectiveN; i++) {
            s = mixLetters(s);
        }
        return s;
    }

    private static String mixLetters(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even.append(s.charAt(i));
            } else {
                odd.append(s.charAt(i));
            }
        }
        return even.append(odd).toString();
    }

}