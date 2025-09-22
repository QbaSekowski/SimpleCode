package mate.academy;

public class Kata {
    public int sumDigits(String number) {
        char[] chars = number.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
