package mate.academy;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int maxNumberOfDigits = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            int numberOfDigits = String.valueOf(numbers[i]).length();
            if (numberOfDigits > maxNumberOfDigits) {
                maxNumberOfDigits = numberOfDigits;
                index = i;
            }
        }
        return numbers[index];
    }
}