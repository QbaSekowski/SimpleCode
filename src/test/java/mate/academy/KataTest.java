package mate.academy;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void tests() {
        assertEquals(-1, Kata.opposite(1));
    }
}