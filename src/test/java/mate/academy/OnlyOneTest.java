package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OnlyOneTest {
    @Test
    void emptyTest() {
        assertEquals(false, OnlyOne.onlyOne());
    }
    @Test
    void containsOneTrueTest() {
        assertEquals(true, OnlyOne.onlyOne(true, false, false));
    }
    @Test
    void containsSomeTrueTest() {
        assertEquals(false, OnlyOne.onlyOne(true, false, false, true));
    }
    @Test
    void containsOnlyFalseTest() {
        assertEquals(false, OnlyOne.onlyOne(false, false, false, false));
    }
}
