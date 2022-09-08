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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int depth = 0;
        helper(root, depth, res);
        return res;
    }
    
    public static void helper(TreeNode node, int depth, List<List<Integer>> res){
        if(node == null) return;
        if(node != null){
            if(res.size() < depth + 1)
                res.add(new ArrayList<>());
            res.get(depth).add(node.val);
        }

        
        if (node.left != null)
            helper(node.left, depth + 1, res);
        if (node.right != null)
            helper(node.right, depth + 1, res);
    }
}