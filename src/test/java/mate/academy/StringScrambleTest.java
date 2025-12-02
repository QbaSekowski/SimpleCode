package mate.academy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.*;

class StringScrambleTest {

    @Test
    @DisplayName("Basic Test 1")
    void testBasic1() {
        String inputStr = "abcd";
        int[] inputArr = new int[]{0,3,1,2};
        String message = "string = "+inputStr+"\nindices = "+Arrays.toString(inputArr);

        assertEquals("acdb", StringScramble.scramble(inputStr, inputArr), message);
    }

    @Test
    @DisplayName("Basic Test 2")
    void testBasic2() {
        String inputStr = "sc301s";
        int[] inputArr = new int[]{4,0,3,1,5,2};
        String message = "string = "+inputStr+"\nindices = "+Arrays.toString(inputArr);

        assertEquals("c0s3s1", StringScramble.scramble(inputStr, inputArr), message);
    }

    @Test
    @DisplayName("Basic Test 3")
    void testBasic3() {
        String inputStr = "bskl5";
        int[] inputArr = new int[]{2,1,4,3,0};
        String message = "string = "+inputStr+"\nindices = "+Arrays.toString(inputArr);

        assertEquals("5sblk", StringScramble.scramble(inputStr, inputArr), message);
    }

}
