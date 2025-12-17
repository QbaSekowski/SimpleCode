package mate.academy;

public class FindOutlier {
    static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        boolean lookingForEven = oddCount > evenCount;
        for (int n : integers) {
            if ((n % 2 == 0) == lookingForEven) {
                return n;
            }
        }
        return 0;
    }
}
