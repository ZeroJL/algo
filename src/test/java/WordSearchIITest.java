import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordSearchIITest {

    @Test
    void solution1() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};

        WordSearchII wordSearchII = new WordSearchII();
        List<String> result = wordSearchII.solution(board, words);
        Collections.sort(result);

        String[] output = {"eat", "oath"};
        Arrays.sort(output);

        Assertions.assertEquals(output.length, result.size());

        for (int i = 0; i < result.size(); ++i) {
            Assertions.assertEquals(output[i], result.get(i));
        }
    }

    @Test
    void solution2() {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String[] words = {"abcb"};

        WordSearchII wordSearchII = new WordSearchII();
        List<String> result = wordSearchII.solution(board, words);
        Collections.sort(result);

        String[] output = {};

        Assertions.assertEquals(output.length, result.size());

        for (int i = 0; i < result.size(); ++i) {
            Assertions.assertEquals(output[i], result.get(i));
        }
    }
}
