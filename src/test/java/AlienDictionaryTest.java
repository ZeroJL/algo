import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlienDictionaryTest {

    @Test
    void solution1() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        AlienDictionary alienDictionary = new AlienDictionary();
        String result = alienDictionary.solution(words);
        Assertions.assertEquals("wertf", result);
    }

    @Test
    void solution2() {
        String[] words = {"z", "x"};
        AlienDictionary alienDictionary = new AlienDictionary();
        String result = alienDictionary.solution(words);
        Assertions.assertEquals("zx", result);
    }

    @Test
    void solution3() {
        String[] words = {"z", "x", "z"};
        AlienDictionary alienDictionary = new AlienDictionary();
        String result = alienDictionary.solution(words);
        Assertions.assertEquals("", result);
    }
}
