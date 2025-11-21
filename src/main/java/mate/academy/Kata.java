package mate.academy;

class Kata {
    static String alphabetPosition(String text) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (text.toLowerCase().charAt(i) == alphabet[j]) {
                    sb.append(j + 1).append(" ");
                    break;
                }
            }
        }
        return sb.toString().trim();
    }
}
