package mate.academy;

public class DecTools {
    public static int Digits(long n) {
        int counter = 0;
        while (n > 0) {
            n /= 10;
            counter++;
        }
        return counter;
    }
}