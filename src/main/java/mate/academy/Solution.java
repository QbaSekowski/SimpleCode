package mate.academy;

class Solution {
    public static String camelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        if (input.length() == 1) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                sb.append(" ");
                sb.append(input.charAt(i));
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}