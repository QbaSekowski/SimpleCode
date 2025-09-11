package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class AsciiTest {
    @Test
    public void testBasic() {
        assertEquals(254, Ascii.getWeight("Joe"));
        assertEquals(205, Ascii.getWeight("CJ"));
        assertEquals(141, Ascii.getWeight("cj"));
    }
}
