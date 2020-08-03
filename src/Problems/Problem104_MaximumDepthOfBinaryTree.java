package Problems;

import Utils.TreeNode;

public class Problem104_MaximumDepthOfBinaryTree {

    public int solution(TreeNode root) {
        if (root == null) return 0;
        return Math.max(solution(root.left)+1, solution(root.right)+1);
    }

}
