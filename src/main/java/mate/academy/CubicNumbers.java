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
        for (int i = 0; i < digitsOnly.length(); i += 3) {
            int end = Math.min(i + 3, digitsOnly.length());
            String part = digitsOnly.substring(i, end);
            numbers.add(Integer.parseInt(part));
        }
        List<Integer> cubicNumbers = new ArrayList<>();
        int sum = 0;
        for (int num : numbers) {
            if (isCubic(num)) {
                cubicNumbers.add(num);
                sum += num;
            }
        }
        if (cubicNumbers.isEmpty()) {
            return "Unlucky";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int n : cubicNumbers) {
                sb.append(n).append(" ");
            }
            sb.append(sum).append(" Lucky");
            return sb.toString();
        }
    }

    private static boolean isCubic(int num) {
        int original = num;
        int sum = 0;
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            int d = c - '0';
            sum += d * d * d;
        }
        return sum == original;
    }
}
