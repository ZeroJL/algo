import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixTest {

    @Test
    void solutionTest1() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        boolean result = searchA2DMatrix.solution(matrix, target);
        Assertions.assertTrue(result);
    }
}
