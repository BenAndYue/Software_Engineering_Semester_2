import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test cases for the {@link PancakeSort#findMax(int[], int)} method.
 */


public class PancakeOrder {
//    flipping methods
    /**
     * Tests finding the maximum pancake in the pancakes array with 5 pancakes.
     * Verifies that the correct maximum pancake index is returned.
     */
    @Test
    public void findMaxTest() {
        int[] pancakes = {1, 4, 2, 5, 3};
        int maxIndex = PancakeSort.findMax(pancakes, 4);
        assertEquals(3, maxIndex);
    }

    /**
     * Test case to verify that the findMax method returns the correct index of the largest pancake in a given array:
     */
    @Test
    public void findMax_ReturnsCorrectIndexOfLargestPancake() {
        int[] pancakes = {2, 3, 4, 1};
        int end = pancakes.length - 1;
        int expected = 2;

        int result = PancakeSort.findMax(pancakes, end);

        assertEquals(expected, result);
    }

    /**
     * Test case to verify that the findMax method returns the correct index of the largest pancake in a given array when all pancake sizes are equal:
     */
    @Test
    public void findMax_ReturnsCorrectIndexOfLargestPancake_AllSizesEqual() {
        int[] pancakes = {1, 1, 1, 1};
        int end = pancakes.length - 1;
        int expected = 0;

        int result = PancakeSort.findMax(pancakes, end);

        assertEquals(expected, result);
    }
    /**
     * Test case to verify that the findMax method returns the correct index of the largest pancake in a given array when the array is empty:
     */
    @Test
    public void findMax_ReturnsCorrectIndexOfLargestPancake_ArrayIsEmpty() {
        int[] pancakes = {};
        int end = -1;
        int expected = 0;

        int result = PancakeSort.findMax(pancakes, end);

        assertEquals(expected, result);
    }
}
