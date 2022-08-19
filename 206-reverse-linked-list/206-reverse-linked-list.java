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
    public ListNode revList(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode t = revList(head.next);
        head.next.next = head;
        head.next = null;
        return t;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        return revList(head);
        
    }
}