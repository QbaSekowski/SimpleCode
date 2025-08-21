package mate.academy;

public class IdentifierChecker {
    public static boolean isValid(String idn) {
        if (idn == null || idn.isEmpty()) {
            return false;
        }
        char first = idn.charAt(0);
        if (!(Character.isLetter(first) || first == '_' || first == '$')) {
            return false;
        }
        for (int i = 1; i < idn.length(); i++) {
            char c = idn.charAt(i);
            if (!(Character.isLetterOrDigit(c) || c == '_' || c == '$')) {
                return false;
            }
        }
        return true;
    }
}
