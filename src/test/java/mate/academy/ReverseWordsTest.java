package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

class ReverseWordsTest {
    @Test
    void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
        assertEquals("elppa", ReverseWords.reverseWords("apple"), "Input: \"apple\"");
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"), "Input: \"a b c d\"");
        assertEquals("  elbuod  decaps  sdrow  ", ReverseWords.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }
}
