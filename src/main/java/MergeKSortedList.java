import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedList {

    public ListNode solution(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.val));

        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }

        return merge(queue);
    }

    private ListNode merge(Queue<ListNode> queue) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            current.next = node;
            current = current.next;

            if (node.next != null) {
                queue.add(node.next);
            }
        }

        return dummy.next;
    }
}
