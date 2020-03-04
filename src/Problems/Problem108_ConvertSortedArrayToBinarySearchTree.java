package Problems;

import utils.TreeNode;

public class Problem108_ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode node = createNode(nums, 0, nums.length -1);
        return node;
    }

    public TreeNode createNode( int[] nums, int low, int high) {
        if (low > high) return null;
        int middle = (low + high)/2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = createNode(nums, low, middle-1);
        node.right = createNode(nums, middle+1, high);
        return node;
    }

}
