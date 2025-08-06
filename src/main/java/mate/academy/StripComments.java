package mate.academy;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder sb = new StringBuilder();
        String[] lines = text.split("\n");
        for (String line : lines) {
            for (int i = 0; i < commentSymbols.length; i++) {
                if (line.contains(commentSymbols[i])) {
                    line = line.substring(0, line.indexOf(commentSymbols[i]));
                }
            }
            sb.append(line.trim()).append("\n");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }
}
