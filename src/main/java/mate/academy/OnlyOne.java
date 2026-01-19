package mate.academy;

public class OnlyOne {
    public static boolean onlyOne(Boolean... args) {
        int counter = 0;
        for (Boolean arg : args) {
            if (arg) counter++;
        }
        if (counter == 1) return true;
        return false;
    }
}