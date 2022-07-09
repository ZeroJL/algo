import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {

    KthLargestElementInAnArray solution;

    @BeforeEach
    void beforeEach() {
        solution = new KthLargestElementInAnArray();
    }

    @Test
    @DisplayName("Kth Largest Elem test 1")
    void findKthLargestTest() {
        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        int k = 2;
        assertEquals(solution.findKthLargest(nums, k), 5);
    }

    @Test
    void findKthLargestTest2() {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        assertEquals(solution.findKthLargest(nums, k),4 );
    }
}