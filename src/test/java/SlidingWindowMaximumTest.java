import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {

    @Test
    void solution1() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] result = slidingWindowMaximum.solution(nums, k);

        Assertions.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, result);
    }

    @Test
    void solution2() {
        int[] nums = {1};
        int k = 1;
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] result = slidingWindowMaximum.solution(nums, k);

        Assertions.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void solution3() {
        int[] nums = {1, 3, 1, 2, 0, 5};
        int k = 3;
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int[] result = slidingWindowMaximum.solution(nums, k);

        Assertions.assertArrayEquals(new int[]{3, 3, 2, 5}, result);
    }
}
