package mate.academy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveRepeatedLettersTest {
    @Test
    void testBanana() {
        assertEquals("ban", RemoveRepeatedLetters.removeRepeatedLetters("banan"));
    }

    @Test
    void testPustyString() {
        assertEquals("", RemoveRepeatedLetters.removeRepeatedLetters(""));
    }

    @Test
    void testBezPowtorzen() {
        assertEquals("kot", RemoveRepeatedLetters.removeRepeatedLetters("kot"));
    }

    @Test
    void testWszystkieTeSameLitery() {
        assertEquals("a", RemoveRepeatedLetters.removeRepeatedLetters("aaaaaa"));
    }
}
