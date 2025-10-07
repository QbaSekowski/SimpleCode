package mate.academy;

import java.util.Random;

public class Ghost {
    private String color;
    private static final String[] COLORS = {"white", "yellow", "purple", "red"};
    private static final Random RANDOM = new Random();

    public Ghost() {
        this.color = COLORS[RANDOM.nextInt(COLORS.length)];
    }

    public String getColor() {
        return color;
    }
}