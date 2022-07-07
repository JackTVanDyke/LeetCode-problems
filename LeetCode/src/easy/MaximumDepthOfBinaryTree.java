package easy;

import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }
}
