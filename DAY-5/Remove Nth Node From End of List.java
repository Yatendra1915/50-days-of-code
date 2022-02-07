/*https://leetcode.com/problems/remove-nth-node-from-end-of-list/*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create two nodes pointing to head;
        ListNode first=head;
        ListNode second=head;
        
       // make second node n nodes ahead of first node;
        for(int i=0;i<n;i++){
            second=second.next;
        }
        
        // If second node is null, that mean n == list.size-1;
        // that means we have to remove the head of the list;
        if(second==null)
            return first.next;
        
        // if second node is not null, lets move both first and second nodes
        // until second.next == null;
        // remember after this, first node will n+1 nodes from the end;
        while(second.next!=null){
            second=second.next;
            first=first.next;
        }
        
        // we can easily skip nth node and make first.next point to n.next;
        first.next=first.next.next;
        
        return head;

    }
}
