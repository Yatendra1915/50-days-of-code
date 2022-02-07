/*https://leetcode.com/problems/middle-of-the-linked-list/*/
class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode fast=head,slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
}
