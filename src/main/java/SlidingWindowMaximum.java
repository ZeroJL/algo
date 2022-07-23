import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] solution(int[] nums, int k) {

        if (nums == null || k == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; ++i) {
            if (!queue.isEmpty() && queue.size() > k - 1) {
                queue.poll();
            }

            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.poll();
            }

            queue.add(i);
            if (i >= k - 1) {
                result[resultIndex++] = nums[queue.peek()];
            }
        }


        return result;
    }
}
