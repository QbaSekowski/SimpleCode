package mate.academy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JomoPipiTest {
    @Test
    public void fixed1() {
        String s = "Such Wow!", a = "Sc o!uhWw";
        assertEquals(a, JomoPipi.jumbledString(s,1));
    }

    @Test
    public void fixed2() {
        String s = "better example", a = "bexltept merae";
        assertEquals(a, JomoPipi.jumbledString(s,2));
    }

    @Test
    public void fixed3() {
        String s = "Greetings", a = "Gtsegenri";
        assertEquals(a, JomoPipi.jumbledString(s,8));
    }
}