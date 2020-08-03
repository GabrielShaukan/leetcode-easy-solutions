package Problems;

import Utils.TreeNode;

public class Problem110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(checkLevelMax(root.left) - checkLevelMax(root.right)) < 2)
            return isBalanced(root.left) && isBalanced(root.right);
        return false;
    }

    public int checkLevelMax(TreeNode root) {
        if (root == null) return 0;
        return Math.max(checkLevelMax(root.left)+1, checkLevelMax(root.right)+1);
    }

}
