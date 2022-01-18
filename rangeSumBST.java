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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root,low,high);
    }
    
    public int helper(TreeNode root, int L, int H) {
        if (root != null) {
            if (root.val >= L && root.val <= H) {
                // Check if it is in range
                return root.val + helper(root.left,L,H) + helper(root.right,L,H);
            } else {
                // If not in range, we do not want to include the current node, but still keep checking its children nodes
                return helper(root.left,L,H) + helper(root.right,L,H);
            }
        }
        return 0;
    }
}
