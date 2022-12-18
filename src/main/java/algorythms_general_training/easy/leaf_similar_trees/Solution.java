package algorythms_general_training.easy.leaf_similar_trees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        depthFirstSearch(root1, leaves1);
        depthFirstSearch(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void depthFirstSearch(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                leafValues.add(node.val);
            }
            depthFirstSearch(node.left, leafValues);
            depthFirstSearch(node.right, leafValues);
        }
    }
}
