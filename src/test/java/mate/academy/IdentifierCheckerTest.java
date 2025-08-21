package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdentifierCheckerTest {
    @Test
    public void testValid() {
        assertEquals(true, IdentifierChecker.isValid("i1"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, IdentifierChecker.isValid("1i"));
    }
}
