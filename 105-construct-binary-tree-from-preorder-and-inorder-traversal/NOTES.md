/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {
private TreeNode getTree(int[] pre, int[] in, Map<Integer, Integer> map){
if(pre.length==0 || in.length==0)
return null;
TreeNode node = new TreeNode(pre[0]);
node.val = pre[0];
int index = map.get(pre[0]);
node.left = getTree(Arrays.copyOfRange(pre, 1, index+1), Arrays.copyOfRange(in, 0, index), map);
node.right = getTree(Arrays.copyOfRange(pre, index+1, pre.length), Arrays.copyOfRange(in, index, in.length), map);
return node;
}
public TreeNode buildTree(int[] preorder, int[] inorder) {
Map<Integer, Integer> map = new HashMap<>();
for(int i=0; i<inorder.length; i++)
map.put(inorder[i], i);
return getTree(preorder, inorder, map);
}
}