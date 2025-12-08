package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceCalculatorTest {
    static void tester(String input, int expected){
        String message = String.format("Failed for input: %s",input);
        assertEquals(expected, SentenceCalculator.lettersToNumbers(input),message);
    }
    @Test
    void sampleTests() {
        //tester(input, expected)
        tester("I Love You", 170);
        tester("ILoveYou", 170);
        tester("ARE YOU HUNGRY?", 356);
        tester("oops, i did it again!", 152);
        tester("Give me 5!", 73);
        tester("Give me five!", 110);
    }
}
