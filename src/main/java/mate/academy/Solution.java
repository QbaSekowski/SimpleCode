package mate.academy;

class Solution {
    public static String isSortedAndHow(int[] array) {
        int desc = 0;
        int asc = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                desc++;
            }
            if (array[i] <= array[i + 1]) {
                asc++;
            }
        }
        if (asc == array.length - 1) {
            return "yes, ascending";
        }
        if (desc == array.length - 1) {
            return "yes, descending";
        }
        return "no";
    }
}