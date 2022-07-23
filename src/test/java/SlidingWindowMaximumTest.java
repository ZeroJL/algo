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
}
