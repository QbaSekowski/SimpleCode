package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodewarsTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
