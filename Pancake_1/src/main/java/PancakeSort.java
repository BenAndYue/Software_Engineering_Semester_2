import java.util.Arrays;

/**
 * //KESTENBAUM: The student with the five-thirds N algorithm was Bill Gates. So what does five-thirds N mean? Well,
 * there's a fairly simple way to sort the stack,
 * but it would require two flips per pancake - two N. Basically, you start by sticking the spatula under the biggest pancake,
 * flip it and the stack above it, which puts the biggest one on top. Then you flip the whole stack,
 * putting the biggest pancake where you want it, on the bottom. Then you repeat this for the second largest one, etc.
 */
public class PancakeSort {
    public static void main(String[] args) {


        int[] pancakes = {3, 4, 1, 5, 2};
        sort(pancakes);
        System.out.println(Arrays.toString(pancakes));
    }

    public static void sort(int[] pancakes) {
//        TODO check list size

        for (int i = pancakes.length - 1; i >= 1; i--) {
            int maxIndex = findMax(pancakes, i);
            if (maxIndex != i) {
                flip(pancakes, maxIndex);
                flip(pancakes, i);
            }
        }
    }

    //    finding the max
    static int findMax(int[] pancakes, int end) {
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (pancakes[i] > pancakes[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //    flipping the current stack of pancakes
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
