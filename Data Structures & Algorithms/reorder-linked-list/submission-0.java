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
    public void reorderList(ListNode head) {
        ListNode first=new ListNode();
        ListNode ans=first;
        ListNode temp=head;
        ListNode temp1=head;
        int firstbreak=0;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        firstbreak=length%2==0?length/2:(length/2)+1;
        int counter=0;
        ListNode firstend=null;
        while(counter!=firstbreak){
            counter++;
            firstend=temp;
            temp=temp.next;
        }
        firstend.next=null;
        temp=reverse(temp);
        // while(head!=null){
        //     System.out.print(head.val+"->");
        //     head=head.next;
        // }
        // System.out.println();
        // while(temp!=null){
        //     System.out.print(temp.val+"->");
        //     temp=temp.next;
        // }
        // System.out.println();
        while(temp!=null){
            first.next=temp1;
            temp1=temp1.next;
            first=first.next;
            first.next=temp;
            temp=temp.next;
            first=first.next;
        }
        if(temp1!=null)first.next=temp1;
        // while(ans!=null){
        //     System.out.print(ans.val+"->");
        //     ans=ans.next;
        // }
    }
    public ListNode reverse(ListNode in){
        ListNode prev=null;
        ListNode curr=in;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    return prev;
    }
}
