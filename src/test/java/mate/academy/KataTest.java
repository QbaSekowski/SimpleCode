package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;
import java.util.function.*;
import java.lang.reflect.*;

public class KataTest {
    @Test
    void sampleTests() {
        doTest(new int[] {100, 50, 25, 75, 0}, 50.0);
        doTest(new int[]{5, 5, 5, 5}, 5.0);
        doTest(new int[]{1, 2, 3}, 2.0);
        doTest(new int[]{}, 0.0);
        doTest(new int[]{6, 4, 5, 2, 7}, 4.8);
    }

    private static void doTest(int[] input, double expected) {
        String message = String.format("array = %s\n", Arrays.toString(input));
        double actual = findAverage.apply(input);
        assertEquals(expected, actual, 1e-6, message);
    }

    private static final Function<int[], Double> findAverage;
    static { // retrocompatibility with snake_case function name
        Method method = null;
        try { // old solutions
            method = Kata.class.getDeclaredMethod("findAverage", int[].class);
        } catch (NoSuchMethodException ignore) { // new solutions
            try {
                method = Kata.class.getDeclaredMethod("find_average", int[].class);
            } catch (NoSuchMethodException ignoreToo) {}
        }
        final Method finalMethod = method;
        findAverage = (int[] input) -> {
            try {
                return (Double) finalMethod.invoke(null, input);
            } catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        };
    }
}