package mate.academy;

public class Kata {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
