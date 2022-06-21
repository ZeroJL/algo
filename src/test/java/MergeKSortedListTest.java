import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeKSortedListTest {
    private MergeKSortedList solution;

    @BeforeAll
    public void makeSolution() {
        this.solution = new MergeKSortedList();
    }
    @Test
    public void checkMerge() {
        ListNode[] input = makeListWithArray(new int[][] {{1,4,5}, {1,3,4}, {2,6}});
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next = new ListNode(2);
        node.next = new ListNode(3);
        node.next = new ListNode(4);
        node.next = new ListNode(4);
        node.next = new ListNode(5);
        node.next = new ListNode(6);
        ListNode result =this.solution.solution(input);

        assertTrue(checkList(result, node));
    }

    private boolean checkList(ListNode result, ListNode answer) {
        while (result != null || answer != null) {
            if (result == null || answer == null) {
                return false;
            }

            if (result.val != answer.val) {
                return false;
            }

            result = result.next;
            answer = answer.next;
        }
    }
    private ListNode[] makeListWithArray(int[][] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        if (lists[0] == null || lists[0].length == 0) {
            return null;
        }

        ListNode[] result = new ListNode[lists.length];
        for (int i = 0; i < lists.length; ++i) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            for (int j = 0; j < lists[0].length; ++j) {
                current.next = new ListNode(lists[i][j]);
            }
            result[i] = dummy.next;
        }

        return result;
    }
}
