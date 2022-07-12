import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {

    @Test
    void solutionTest() {
        int[] nums = new int[]{10, 2};
        LargestNumber largestNumber = new LargestNumber();
        String result = largestNumber.solution(nums);

        Assertions.assertEquals("210", result);
    }
}
