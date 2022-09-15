/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, 0, res);
        return res;
    }
    
    private void helper(TreeNode node, int depth, List<List<Integer>> res){
        
        if(node == null) return;

        if(res.size() < depth + 1)
            res.add(new ArrayList<>());
        
        if(depth % 2 == 0) res.get(depth).add(node.val);
        else res.get(depth).add(0, node.val);

        if (node.left != null)
            helper(node.left, depth + 1, res);
        if (node.right != null)
            helper(node.right, depth + 1, res);
    }
}