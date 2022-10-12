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
    public boolean isValidBST(TreeNode root) {
        return validateBst(root, null, null);
    }
    
    private boolean validateBst(TreeNode root, Integer curVal, Integer preVal){
        if (root == null) {
            return true;
        }
        if ((curVal != null && root.val <= curVal) || (preVal != null && root.val >= preVal)) {
            return false;
        }

        return validateBst(root.right, root.val, preVal) && validateBst(root.left, curVal, root.val);
    }
}