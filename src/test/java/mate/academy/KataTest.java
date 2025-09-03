package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private static void doTest(String str, int expected) {
        int actual = Kata.getRealLength(str);
        assertEquals(expected, actual, "for string: \"" + str + "\"\n");
    }

    @Test
    void sampleTests() {
        doTest("", 0);
        doTest("abcd", 4);
        doTest("中国", 2);
        doTest("𝓪𝓫𝓬𝓭", 4);
        doTest("𨭎𩷶", 2);
        doTest("😸🦌🚀", 3);
        doTest("↓→↑←", 4);
        doTest("\nabc\ndef\n", 9);
    }
}
