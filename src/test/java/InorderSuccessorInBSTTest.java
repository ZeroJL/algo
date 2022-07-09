import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class InorderSuccessorInBSTTest {

    @Test
    void InorderSuccessorTest() {
        InorderSuccessorInBST solution = new InorderSuccessorInBST();
        TreeNode root = makeTree(new Integer[]{2, 1, 3});
        TreeNode treeNode = solution.inorderSuccessor(root, new TreeNode(1));
        Assertions.assertEquals(treeNode.val, 2);
    }

    @Test
    void InorderSuccessorTest2() {
        InorderSuccessorInBST solution = new InorderSuccessorInBST();
        TreeNode root = makeTree(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        TreeNode treeNode = solution.inorderSuccessor(root, new TreeNode(6));
        Assertions.assertNull(treeNode);

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