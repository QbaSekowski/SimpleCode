package mate.academy;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null || arrayOfSheeps.length == 0) {
            return 0;
        }
        int counter = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (Boolean.TRUE.equals(sheep)) {
                counter++;
            }
        }
        return counter;
    }
}
