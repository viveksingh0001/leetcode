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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        
        if(root!=null)
            q.add(root);
        
        while(!q.isEmpty()){
            List<TreeNode> l = new ArrayList<>();
            List<Integer> l1 = new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                l1.add(node.val);
                if(node.left!=null)
                    l.add(node.left);
                if(node.right!=null)
                    l.add(node.right);
            }
            list.add(l1);
            for(TreeNode n : l)
                q.add(n);
        }
        return list;
    }
}