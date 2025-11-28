package mate.academy;

public class Kata {
    public static String highAndLow(String numbers) {
        int[] arr = new int[numbers.split(" ").length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbers.split(" ")[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return max + " " + min;
    }
}
