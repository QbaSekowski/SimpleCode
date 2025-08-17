package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void basicTest() {
        assertEquals(0, Solution.signChange(new int[] {1, 3, 4, 5}));
        assertEquals(2, Solution.signChange(new int[] {1, -3, -4, 0, 5}));
        assertEquals(0, Solution.signChange(new int[] {}));
        assertEquals(3, Solution.signChange(new int[] {-47, 84, -30, -11, -5, 74, 77}));
    }
}
