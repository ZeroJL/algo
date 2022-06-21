import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeKSortedListTest {
    private static MergeKSortedList solution;

    @BeforeAll
    public static void makeSolution() {
        solution = new MergeKSortedList();
    }
    @Test
    public void checkMerge() {
        ListNode[] input = new ListNode[3];
        input[0] = new ListNode(1);
        ListNode inputPtr = input[0];
        inputPtr.next = new ListNode(4);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(5);

        input[1] = new ListNode(1);
        inputPtr = input[1];
        inputPtr.next = new ListNode(3);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(4);

        input[2] = new ListNode(2);
        inputPtr = input[2];
        inputPtr.next = new ListNode(6);

        ListNode node = new ListNode(1);
        inputPtr = node;
        inputPtr.next = new ListNode(1);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(2);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(3);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(4);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(4);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(5);
        inputPtr = inputPtr.next;
        inputPtr.next = new ListNode(6);

        ListNode result = solution.solution(input);

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

        return true;
    }
}
