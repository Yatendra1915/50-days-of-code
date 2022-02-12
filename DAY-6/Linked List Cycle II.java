/*https://leetcode.com/problems/linked-list-cycle-ii/*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                fast=head;    
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        
        return null;
    }
}