import java.util.Arrays;

public class LargestNumber {

    public String solution(int[] nums) {
        String[] numsToString = new String[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            numsToString[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(numsToString, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if ("0".equals(numsToString[0])) {
            return "0";
        }
        String result = "";
        for (String str : numsToString) {
            result += str;
        }

        return result;
    }
}
