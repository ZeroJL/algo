import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeetingRoomsIITest {

    @Test
    void solution1() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int result = meetingRoomsII.solution(intervals);

        Assertions.assertEquals(2, result);
    }

    @Test
    void solution2() {
        int[][] intervals = {{7, 10}, {2, 4}};
        MeetingRoomsII meetingRoomsII = new MeetingRoomsII();
        int result = meetingRoomsII.solution(intervals);

        Assertions.assertEquals(1, result);
    }
}
