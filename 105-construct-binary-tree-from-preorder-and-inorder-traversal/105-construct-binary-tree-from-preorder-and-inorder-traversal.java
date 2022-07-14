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
    int preIndex;
    private TreeNode getTree(int[] pre, Map<Integer, Integer> map, int left, int right){
        if(left>right || preIndex>=pre.length)
            return null;
        int val = pre[preIndex++];
        TreeNode root = new TreeNode(val);
        int index = map.get(val);
        root.left = getTree(pre, map, left, index-1);
        root.right = getTree(pre, map, index+1, right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++)
            map.put(inorder[i], i);
        return getTree(preorder, map, 0, preorder.length);
    }
}