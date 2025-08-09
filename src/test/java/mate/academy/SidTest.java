package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SidTest {
    @Test
    public void checkingForOddNumbers() {
        assertEquals(9, Sid.simpleMultiplication(1));
        assertEquals(27, Sid.simpleMultiplication(3));
        assertEquals(189, Sid.simpleMultiplication(21));
        assertEquals(207, Sid.simpleMultiplication(23));
    }

    @Test
    public void checkingForEvenNumbers() {
        assertEquals(16, Sid.simpleMultiplication(2));
        assertEquals(32, Sid.simpleMultiplication(4));
        assertEquals(176, Sid.simpleMultiplication(22));
        assertEquals(208, Sid.simpleMultiplication(26));
    }
}
