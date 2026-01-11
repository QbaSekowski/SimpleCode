package mate.academy;

public class Divisible {
    public static boolean isDivisible(int... numbers) {
        if (numbers.length <= 1) {
            return true;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] % numbers[i] != 0) {
                return false;
            }
        }
        return true;
    }
}