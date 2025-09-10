package mate.academy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class KataTest {

    @Test
    @Order(1)
    void downcase() {
        String[] strings = new String[]{"jo", "nelson", "jurie"};
        assertArrayEquals(new String[]{"Jo", "Nelson", "Jurie"}, Kata.capMe(strings), "For input: [\"jo\", \"nelson\", \"jurie\"]");
    }

    @Test
    @Order(2)
    void caps() {
        String[] strings = new String[]{"OZZA", "ARRA", "AZZA"};
        assertArrayEquals(new String[]{"Ozza", "Arra", "Azza"}, Kata.capMe(strings), "For input: [\"OZZA\", \"ARRA\", \"AZZA\"]");
    }

    @Test
    @Order(3)
    void different() {
        String[] strings = new String[]{"Ror", "NOR", "xor"};
        assertArrayEquals(new String[]{"Ror", "Nor", "Xor"}, Kata.capMe(strings), "For input: [\"Ror\", \"NOR\", \"xor\"]");
    }

    @Test
    @Order(4)
    void emptyArray() {
        String[] strings = new String[0];
        assertArrayEquals(new String[0], Kata.capMe(strings), "For input: []");
    }

    @Test
    @Order(5)
    void emptyStrings() {
        String[] strings = new String[]{"", "", ""};
        assertArrayEquals(new String[]{"", "", ""}, Kata.capMe(strings), "For input: [\"\", \"\", \"\"]");
    }
}
