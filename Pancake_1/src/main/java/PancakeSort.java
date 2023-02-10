import java.util.Arrays;

public class PancakeSort {
    public static void main(String[] args) {


        int[] pancakes = {3, 4, 1, 5, 2};
        sort(pancakes);
        System.out.println(Arrays.toString(pancakes));
    }

    private static void sort(int[] pancakes) {
    }


    static void flip(int[] pancakes, int end) {
        int start = 0;
        while (start < end) {
            int temp = pancakes[start];
            pancakes[start] = pancakes[end];
            pancakes[end] = temp;
            start++;
            end--;
        }
    }
}
