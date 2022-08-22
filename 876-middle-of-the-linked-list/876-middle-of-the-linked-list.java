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
    int maxCount;
    public ListNode getNext(ListNode head, int count, ListNode temp){
        if(head==null)
            return null;
        count++;
        if(count>maxCount)
            maxCount=count;
        // System.out.println("count : " + count + ", maxCount : " + maxCount);
        getNext(head.next, count, temp);
        if((maxCount&1)==1){
            if(count==Math.ceil(maxCount/2.0)){
            // System.out.println("value : "+head.val + ", count : " + count);
            temp.next = head;
            }
        }else{
                if(count==Math.ceil(maxCount/2.0)+1){
                    // System.out.println("value : "+head.val + ", count : " + count);
                    temp.next = head;
                }
            }
        return temp.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = new ListNode();
        return getNext(head, 0, temp);
    }
}