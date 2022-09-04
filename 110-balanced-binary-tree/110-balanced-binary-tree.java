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
    public static int height(TreeNode node){ // calculate the height
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        int leftH;
        int rightH;

        if (root == null)
            return true;

        rightH = height(root.right);
        leftH = height(root.left);

        if (Math.abs(rightH - leftH) <= 1 && isBalanced(root.left)
                && isBalanced(root.right))   // Difference between heights of left and right subtrees
            return true;                // cannot be more than one for all nodes.

        return false;
    }
}