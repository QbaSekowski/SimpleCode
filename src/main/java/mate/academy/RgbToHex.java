package mate.academy;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return toHex(r) + toHex(g) + toHex(b);
    }

    private static String toHex(int value) {
        if (value < 0) value = 0;
        if (value > 255) value = 255;
        return String.format("%02X", value);
    }
}
