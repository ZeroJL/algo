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

    @Test
    void solutionTest2() {
        int[] nums = new int[]{3, 30, 34, 5, 9};
        LargestNumber largestNumber = new LargestNumber();
        String result = largestNumber.solution(nums);

        Assertions.assertEquals("9534330", result);
    }
}
