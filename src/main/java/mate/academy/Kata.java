package mate.academy;

import java.util.Objects;

public class Kata {
    public static String rps(String p1, String p2) {
        if (Objects.equals(p1, p2)) return "Draw";
        if (p1.equals("rock") && p2.equals("scissors")) return "Player 1 won";
        if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won";
        if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won";
        return "Player 2 won";
    }
}
