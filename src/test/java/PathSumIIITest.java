import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumIIITest {

    @Test
    void pathSumTest1() {
        TreeNode root = makeTree(new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1});
        PathSumIII pathSum = new PathSumIII();
        int result = pathSum.solution(root, 8);
        Assertions.assertEquals(result, 3);
    }

    @Test
    void pathSumTest2() {
        TreeNode root = makeTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
        PathSumIII pathSum = new PathSumIII();
        int result = pathSum.solution(root, 22);
        Assertions.assertEquals(result, 3);
    }

    TreeNode makeTree(Integer[] trees) {
        TreeNode root = new TreeNode(trees[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < trees.length && !queue.isEmpty(); ++i) {
            TreeNode current = queue.poll();
            if (trees[i] != null) {
                current.left = new TreeNode(trees[i]);
                queue.add(current.left);
            }
            ++i;
            if (i < trees.length && trees[i] != null) {
                current.right = new TreeNode(trees[i]);
                queue.add(current.right);
            }
        }

        return root;
    }

}
