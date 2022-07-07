package easy;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    public static TreeNode main(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = main(root.left);
        TreeNode right = main(root.right);
        root.right = left;
        root.left = right;
        return root;
    }
}
