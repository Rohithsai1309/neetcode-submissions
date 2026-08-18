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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode ans=dummy;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null){
            ListNode temp=null;
            if(p1.val<=p2.val){
                temp=p1.next;
                p1.next=null;
                ans.next=p1;
                p1=temp;
            }
            else{
                temp=p2.next;
                p2.next=null;
                ans.next=p2;
                p2=temp;
            }
        ans=ans.next;
        }
        if(p1!=null)ans.next=p1;
        if(p2!=null)ans.next=p2;
    return dummy.next;
    }
}