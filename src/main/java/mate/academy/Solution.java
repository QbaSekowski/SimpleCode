package mate.academy;

import java.nio.charset.StandardCharsets;

class Solution {

    public static String binaryToText(String binary) {
        if (binary == null || binary.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String byteString = binary.substring(i, i + 8);
            int charCode = Integer.parseInt(byteString, 2);
            result.append((char) charCode);
        }
        return result.toString();
    }
}
