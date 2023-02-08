import static org.junit.jupiter.api.Assertions.*;

class PancakeSortTest {

    @org.junit.jupiter.api.Test


    void test_Flip() {
        int[] pancakes = {3, 4, 1, 5, 2};
        PancakeSort.flip(pancakes, 4);
        int[] expected = {2, 5, 1, 4, 3};
        assertArrayEquals(expected, pancakes);
    }


}
