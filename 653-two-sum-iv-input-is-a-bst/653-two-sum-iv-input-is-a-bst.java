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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> targetSet = new HashSet<>();
        return helper(root, k, targetSet);
    }
    
    private boolean helper(TreeNode root, int k, HashSet<Integer> set){
        
        if(root == null) return false;
        
        if(set.contains(k - root.val)) return true;
        
        set.add(root.val);
        
        return helper(root.left, k, set) || helper(root.right, k, set);
        
    }
    
}