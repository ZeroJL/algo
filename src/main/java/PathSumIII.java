import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

    private int count = 0;
    private final Map<Integer, Integer> map = new HashMap<>();

    public int solution(TreeNode root, int targetSum) {
        prefixSum(root, targetSum, 0);
        return count;
    }

    private void prefixSum(TreeNode node, int targetSum, int currentSum) {
        if (node == null) {
            return;
        }

        currentSum += node.val;
        if (currentSum == targetSum) {
            ++count;
        }

        count += map.getOrDefault(currentSum - targetSum, 0);

        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);

        prefixSum(node.left, targetSum, currentSum);
        prefixSum(node.right, targetSum, currentSum);
        map.put(currentSum, map.get(currentSum) - 1);
    }


}
