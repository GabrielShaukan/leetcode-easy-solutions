package Problems;

import utils.TreeNode;

public class Problem111_MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {

        return checkLevelMin(root);
    }

    public int checkLevelMin(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return checkLevelMin(root.right)+1;
        if (root.right == null) return checkLevelMin(root.left)+1;
        return Math.min(checkLevelMin(root.left)+1, checkLevelMin(root.right)+1);
    }

}
