import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubStringTest {

    @Test
    void solutionTest() {
        String s = "badbad";
        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();
        String result = longestPalindromicSubString.solution(s);
        Assertions.assertTrue("bab".equals(result));
    }

    @Test
    void solutionTest2() {
        String s = "cbbd";
        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();
        String result = longestPalindromicSubString.solution(s);
        Assertions.assertTrue("bb".equals(result));
    }
}
