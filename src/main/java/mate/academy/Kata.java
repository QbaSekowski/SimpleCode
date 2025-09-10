package mate.academy;

public class Kata {
    public static String[] capMe(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) continue;
            strings[i] = strings[i].toLowerCase();
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }
        return strings;
    }
}
