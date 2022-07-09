public class InorderSuccessorInBST {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode current = root;
        TreeNode successor = null;

        //Using BST property
        while (current != null) {
            if (p.val >= current.val) {
                current = current.right;
            } else {
                successor = current;
                current = current.left;
            }
        }

        return successor;
    }
}
