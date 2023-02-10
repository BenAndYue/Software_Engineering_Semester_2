import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test cases for the {@link PancakeSort#flip(int[], int)} method.
 */


public class PancakeSortTest {
    /**
     * Tests flipping the first 5 elements of the pancakes array with 5 pancakes.
     * Verifies that the smallest pancake is on top after flipping.
     */
    @Test
    public void flipTest1() {
        int[] pancakes = {5, 4, 3, 2, 1};
        PancakeSort.flip(pancakes, 4);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, pancakes);
    }

    /**
     * Tests flipping the first 5 elements of the pancakes array.
     * Verifies that the smallest pancake is on top after flipping.
     */
    @Test
    public void flipTest2() {
        int[] pancakes = {6, 3, 4, 1, 5, 2};
        PancakeSort.flip(pancakes, 5);
        int[] expected = {2, 5, 1, 4, 3, 6};
        assertArrayEquals(expected, pancakes);
    }

    /**
     * Tests flipping the first 5 elements of the pancakes array.
     * Verifies that the largest pancake is on top after flipping.
     */
    @Test
    public void flipTest3() {
        int[] pancakes = {6, 2, 5, 1, 4, 3};
        PancakeSort.flip(pancakes, 5);
        int[] expected = {3, 4, 1, 5, 2, 6};
        assertArrayEquals(expected, pancakes);
    }

    /**
     * Tests flipping the first 25 elements of the pancakes array with 25 pancakes.
     * Verifies that the smallest pancake is on top after flipping.
     */
    @Test
    public void flipTest4() {
        int[] pancakes = {25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        PancakeSort.flip(pancakes, 24);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        assertArrayEquals(expected, pancakes);
    }
}
