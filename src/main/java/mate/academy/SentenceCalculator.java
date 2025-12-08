package mate.academy;

public class SentenceCalculator{
    public static int lettersToNumbers(String s) {
        char[] letters = s.toCharArray();
        int sum = 0;
        for (char letter : letters) {
            if (Character.isDigit(letter)) {
                sum += Integer.parseInt(String.valueOf(letter));
            } else if (Character.isUpperCase(letter)) {
                sum += (Character.toLowerCase(letter) - 'a' + 1) * 2;
            } else if (Character.isLowerCase(letter)) {
                sum += letter - 'a' + 1;
            }
        }
        return sum;
    }
}
