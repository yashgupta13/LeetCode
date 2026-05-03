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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) 
        return head;

        ListNode l=head;
        ListNode r=head;
        ListNode temp=head;

        int pointer=1;
        while(pointer<left-1)
        {
            l=l.next;
            pointer++;
        }
        pointer=1;
        while(pointer<right)
        {
            r=r.next;
            pointer++;
        }
        temp=r.next;
        r.next=null;

        if(left==1){
            head=reverseList(l);
            ListNode t=head;
            while(t.next!=null)
            t=t.next;
            t.next=temp;
        }else{
        ListNode nhead=reverseList(l.next);
        l.next=nhead;

        while(nhead.next!=null)
        nhead=nhead.next;
        nhead.next=temp;

        }

        

        return head;

    }

     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // store next node
            curr.next = prev;          // reverse pointer
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev;
    }

}