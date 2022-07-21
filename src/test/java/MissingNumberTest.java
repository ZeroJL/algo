import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void solution1() {
        int[] nums = {3, 0, 1};

        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.solution(nums);

        Assertions.assertEquals(2, result);
    }

    @Test
    void solution2() {
        int[] nums = {0, 1, 2};

        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.solution(nums);

        Assertions.assertEquals(3, result);
    }
}
