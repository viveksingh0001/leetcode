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
    private void rec(TreeNode root, List<Integer> res, int level){
        if(root==null)
            return;
        if(res.size()==level)
            res.add(root.val);
        rec(root.right, res, level+1);
        rec(root.left, res, level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rec(root, res, 0);
        return res;
    }
}