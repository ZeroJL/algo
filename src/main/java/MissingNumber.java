import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public int solution(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; ++i) {
            missing ^= nums[i] ^ i;
        }

        return missing;
    }
}
