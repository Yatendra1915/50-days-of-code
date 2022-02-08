/*https://leetcode.com/problems/palindrome-linked-list/*/
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode prev = reverse(slow.next,null);
       
        while(prev!=null){
            if(head.val!=prev.val)
                return false;
            prev=prev.next;
            head=head.next;
        }
        
        
        return true;
    }
    
    public ListNode reverse(ListNode head,ListNode prev){
        
        if(head==null)
            return prev;
        
        ListNode next=head.next;
        head.next=prev;
        
        return reverse(next,head);
    }
}
