package Tree;

/**
 * Created by STEFY on 13/01/2019.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val == q.val) {
            boolean sameLeft = isSameTree(p.left, q.left);
            boolean sameRight = isSameTree(p.right, q.right);
            return sameLeft && sameRight;
        } else {
            return false;
        }

    }
}
