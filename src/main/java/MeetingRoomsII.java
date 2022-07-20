import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int solution(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> intervals[a][1]));
        minHeap.add(0);

        int result = 1;
        for (int i = 1; i < intervals.length; ++i) {
            if (!minHeap.isEmpty() && intervals[i][0] >= intervals[minHeap.peek()][1]) {
                minHeap.poll();
            }
            minHeap.add(i);
            result = Math.max(result, minHeap.size());
        }

        return result;
    }
}
