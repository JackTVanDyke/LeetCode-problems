package easy;

import javax.swing.tree.TreeNode;

public class SameTree {
    public static boolean main(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }

    private static boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);
        return left && right;
    }
}
