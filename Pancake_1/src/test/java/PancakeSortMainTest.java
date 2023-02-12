import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * JUnit test cases for the {@link PancakeSort#sort(int[])} method.
 */


public class PancakeSortMainTest {
//    flipping methods

    @Test
    public void test_sort_with_valid_Input() {
        int[] pancakes = {2, 3, 1};
        PancakeSort.sort(pancakes);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, pancakes);
    }

    @Test
    public void test_sort_with_twoPancakes() {
        int[] pancakes = {3, 1};
        PancakeSort.sort(pancakes);
        int[] expected = {1, 3};
        assertArrayEquals(expected, pancakes);
    }

    @Test
    public void test_sort_with_one_pancake() {
        int[] pancakes = {1};
        PancakeSort.sort(pancakes);
        int[] expected = {1};
        assertArrayEquals(expected, pancakes);
    }


    @Test
    public void test_sort_with_25_Pancakes() {
        int[] pancakes = new int[25];
        // Initialize the pancake array with random values
        Random random = new Random();
        for (int i = 0; i < pancakes.length; i++) {
            pancakes[i] = random.nextInt();
        }

        PancakeSort.sort(pancakes);

        // Check if the pancakes are sorted in ascending order
        for (int i = 0; i < pancakes.length - 1; i++) {
            assertTrue(pancakes[i] <= pancakes[i + 1]);
        }
    }

//    TODO more forced error handling


//    @Test(expected = IllegalArgumentException.class)
//    public void testSortWithInvalidInput() {
//        int[] pancakes = {};
//        PancakeSort.sort(pancakes);
//    }

}
