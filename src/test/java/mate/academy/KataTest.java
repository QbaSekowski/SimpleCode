package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
    }
}