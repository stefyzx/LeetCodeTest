package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by STEFY on 13/01/2019.
 * Time complexity : we visit each node exactly once, thus the time complexity is \mathcal{O}(N)O(N), where NN is the number of nodes.

 * Space complexity : in the worst case, the tree is completely unbalanced,
 * e.g. each node has only left child node, the recursion call would occur NN times (the height of the tree),
 * therefore the storage to keep the call stack would be \mathcal{O}(N)O(N).
 * But in the best case (the tree is completely balanced), the height of the tree would be \log(N)log(N).
 * Therefore, the space complexity in this case would be \mathcal{O}(\log(N))O(log(N)).
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int depth =0;
        if (root == null) {
            return depth;
        } else if (root.left == null && root.right == null) {
            return (depth + 1);
        }else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return l>r ? l+1 : r+1;
        }

    }
}
