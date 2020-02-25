package Problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem107_BinaryTreeLevelOrderTraversalII {

    int counter = 0;

    public List<List<Integer>> levelOrderBottom(utils.TreeNode root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>(5);
        if(root == null) return answer;
        answer.add(new ArrayList<Integer>(4));
        check(root, answer, 0);
        Collections.reverse(answer);
        return answer;
    }

    public void check(utils.TreeNode root, List<List<Integer>> answer, int level) {
        if (root == null) return;
        if (level > counter) {
            answer.add(new ArrayList<Integer>(4));
            counter++;
        }
        answer.get(level).add(root.val);

        check(root.left, answer, level +1);
        check(root.right, answer, level +1);
    }

}
