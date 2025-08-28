package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test() {
        assertEquals("579", Kata.sumStrings("123", "456"));
    }
}
