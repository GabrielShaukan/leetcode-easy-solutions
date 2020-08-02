package Problems;

import Utils.TreeNode;

public class Problem226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = new TreeNode();
        if(root == null) return root;
        temp = root.right;

        if (root.left == null && root.right == null) {
            return root;
        } else {
            root.right = root.left;
            root.left = temp;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


}
