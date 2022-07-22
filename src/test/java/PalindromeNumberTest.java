import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    void solution1() {
        int x = 121;

        PalinDromeNumber palinDromeNumber = new PalinDromeNumber();
        boolean result = palinDromeNumber.solution(x);

        Assertions.assertTrue(result);
    }
}
