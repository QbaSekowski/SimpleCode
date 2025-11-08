package mate.academy;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test @DisplayName("Should return 9.0 for arr1 = {1, 2, 3}, arr2 = {4, 5, 6}")
    public void test1() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        assertEquals(9.0, Solution.solution(a1, a2), 1e-6);
    }

    @Test @DisplayName("Should return 6.5 for arr1 = {10, 20, 10, 2}, arr2 = {10, 25, 5, -2}")
    public void test2() {
        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};
        assertEquals(16.5, Solution.solution(b1, b2), 1e-6);
    }

    @Test @DisplayName("Should return 1.0 for arr1 = {0, -1}, arr2 = {-1, 0}")
    public void test3() {
        int[] c1 = {0, -1};
        int[] c2 = {-1, 0};
        assertEquals(1.0, Solution.solution(c1, c2), 1e-6);
    }

    @Test @DisplayName("Should return 0.0 for arr1 = {10, 10}, arr2 = {10, 10}")
    public void test4() {
        int[] d1 = {10, 10};
        int[] d2 = {10, 10};
        assertEquals(0.0, Solution.solution(d1, d2), 1e-6);
    }
}