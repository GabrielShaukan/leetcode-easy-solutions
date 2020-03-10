package Problems;

import utils.TreeNode;

public class Problem112_PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == sum;
        if (root.left == null|| root.right == null || sum - root.val == 0) return subtraction(root.left, sum - root.val) || subtraction(root.right, sum - root.val);
        return subtraction(root, sum);
    }

    public boolean subtraction(TreeNode root, int sum) {
        if (root == null) return false;
        if (sum - root.val == 0 && (root.left == null && root.right == null)) return true;
        return subtraction(root.left, sum - root.val) || subtraction(root.right, sum - root.val);

    }

}
