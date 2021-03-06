import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusRoutesTest {

    @Test
    void solution1() {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;

        BusRoutes busRoutes = new BusRoutes();
        int result = busRoutes.solution(routes, source, target);

        Assertions.assertEquals(result, 2);
    }

    @Test
    void solution2() {
        int[][] routes = {{7, 12}, {4, 5, 15}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;

        BusRoutes busRoutes = new BusRoutes();
        int result = busRoutes.solution(routes, source, target);

        Assertions.assertEquals(result, -1);
    }
}
