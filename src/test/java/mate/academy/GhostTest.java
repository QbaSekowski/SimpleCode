package mate.academy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GhostTests {

    @Test
    void exampleTest() {
        Ghost ghost = new Ghost();
        String color = ghost.getColor();
        assertThat(color).isIn("white", "yellow", "purple", "red");
        assertEquals(color, ghost.getColor(), "Ghosts should not change their color");
    }
}
