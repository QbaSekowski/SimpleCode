package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindOccurrenceTest {
    @Test
    public void basicTests() {
        {
            String string = "Test1 Test2 Test3 Test4";
            doTest("Test", string, 1, 0);
            doTest("Test", string, 2, 6);
            doTest("Test", string, 3, 12);
            doTest("Test", string, 4, 18);
        }
        {
            String string = "TestTestTestTest";
            doTest("TestTest", string, 1, 0);
            doTest("TestTest", string, 2, 4);
            doTest("TestTest", string, 3, 8);
        }
        {
            String string = "Test1 Test2 Test3 Test4";
            doTest("test", string, 1, -1);
            doTest("Test", string, 5, -1);
            doTest("missing", string, 2, -1);
        }
    }

    private static void doTest(String subStr, String str, int occurence, int expected) {
        String message = String.format("subStr = \"%s\"\nstr = \"%s\"\noccurence = %d\n",
                subStr, str, occurence);
        int actual = FindOccurrence.findNthOccurrence(subStr, str, occurence);
        assertEquals(expected, actual, message);
    }
}