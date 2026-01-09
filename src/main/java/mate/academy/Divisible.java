package mate.academy;

public class Divisible {
    public static boolean isDivisible(int... numbers) {
        if (numbers.length <= 1) {
            return true;
        }
        int n = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (n % numbers[i] != 0) {
                return false;
            }
        }
        return true;
    }
}