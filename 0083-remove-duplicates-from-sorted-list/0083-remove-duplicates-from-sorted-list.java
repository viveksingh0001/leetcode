/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node = head;
        int cur = node.val;
        while(node!=null){
            ListNode right = node.next;
            while(right!=null && cur==right.val){
                right = right.next;
            }
            node.next = right;
            node = right;
            if(node!=null)
                cur = node.val;
        }
        return head;
    }
}