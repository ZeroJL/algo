import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubStringTest {

    @Test
    void solutionTest() {
        String s = "badbad";
        LongestPalindromicSubString longestPalindromicSubString = new LongestPalindromicSubString();
        String result = longestPalindromicSubString.solution(s);
        Assertions.assertTrue(s.equals(result));
    }
}
