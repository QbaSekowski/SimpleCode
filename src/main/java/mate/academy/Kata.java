package mate.academy;

public class Kata {

    public static int[] incrementer(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = (numbers[i] + i + 1) % 10;
        }
        return result;
    }
}