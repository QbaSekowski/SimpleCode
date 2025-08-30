package mate.academy;

public class XO {

    public static boolean getXO (String str) {
        int counterX = 0;
        int counterO = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                counterX++;
            } else if (str.charAt(i) == 'o') {
                counterO++;
            }
        }
        return counterX == counterO;
    }
}
