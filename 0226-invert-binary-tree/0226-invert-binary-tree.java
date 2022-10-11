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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode r = q.poll();
            TreeNode templeft=null;
            TreeNode tempRight=null;
            if(r.left!=null){
                q.add(r.left);
                templeft = r.left;
            }
            if(r.right!=null){
                q.add(r.right);
                tempRight = r.right;
            }
            
                r.right = templeft;
                r.left = tempRight;
        }
        return root;
    }
}