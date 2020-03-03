package Problems;

import utils.TreeNode;

public class Problem101_SymmetricTree {

    public boolean solution(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return (root1.val == root2.val) && check(root1.left, root2.right) && check(root1.right, root2.left);
    }

}
