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
    public int getDecimalValue(ListNode head) {
        if(head.next==null)return head.val;
        ListNode temp=head;

        int len=0;
        while(temp!=null)
        {len++;
        temp=temp.next;}
        int ans=0;
        len--;
        while(head!=null)
        {
            if(head.val==1)
            ans=ans+(int)Math.pow(2,len);

            len--;
            head=head.next;
        }
        return ans;
    }
}