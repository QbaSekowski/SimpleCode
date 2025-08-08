package mate.academy;

public class FindOccurrence {
    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int index = -1;
        int fromIndex = 0;
        for (int i = 0; i < occurrence; i++) {
            index = str.indexOf(subStr, fromIndex);
            if (index == -1) {
                return -1;
            }
            fromIndex = index + 1;
        }
        return index;
    }
}
