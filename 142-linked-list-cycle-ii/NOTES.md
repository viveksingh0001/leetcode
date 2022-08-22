/**
* Definition for singly-linked list.
* class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
public ListNode detectCycle(ListNode head) {
if(head==null)
return head;
ListNode p1 = head;
ListNode p2 = head;
while(p1!=p2 && p1!=null && p2!=null){
p1=p1.next;
p2 = p2.next.next;
System.out.println("p1 : " + p1.val + " :: p2 : " + p2.val);
}
if(p1==p2){
p1 = head;
while(p1 != p2){
p1 = p1.next;
p2=p2.next;
}
return p1;
}
return null;
}
}