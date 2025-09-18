package mate.academy;

import java.util.ArrayList;
import java.util.List;

public class CubicNumbers {
    public static String findCubicNumbers(String string) {
        String digitsOnly = string.replaceAll("[^0-9]", "");
        if (digitsOnly.isEmpty()) {
            return "Unlucky";
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < string.length(); i += 3) {
            int end = Math.min(i + 3, string.length());
            String number = string.substring(i, end);
            numbers.add(Integer.parseInt(number));
        }
        int[] numbersArray = numbers.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < numbersArray.length; i++) {
            if (isCubic(numbersArray)) {
                StringBuilder result = new StringBuilder();
                for (int j = 0; j < numbersArray.length; j++) {
                    result.append(numbersArray[j]);
                }
                return result.toString() + " Lucky";
            }
            return "Unlucky";
        }
    }

    private static boolean isCubic(int[] numbersArray) {

    }
}
