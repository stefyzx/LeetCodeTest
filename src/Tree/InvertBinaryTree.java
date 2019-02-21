package Tree;

/**
 * Created by STEFY on 13/01/2019.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return root;

        TreeNode right = root.right;
        TreeNode left = root.left;

        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
