package mate.academy;

public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int diff = arr1[i] - arr2[i];
            sum += diff * diff;
        }
        return sum / arr1.length;
    }
}