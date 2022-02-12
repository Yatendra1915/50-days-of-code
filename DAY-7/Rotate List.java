/*https://leetcode.com/problems/rotate-list/*/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
            return head;
            
        ListNode temp = head;
        
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        
        k=k%length;
        if(k==0)
            return head;
            
        temp = head;
        
        while(k-->0){
            temp=temp.next;
        }
        
        ListNode slow=head;
        
        while(temp!=null && temp.next!=null){
            slow=slow.next;
            temp=temp.next;
        }
        
        ListNode newhead=slow.next;
        slow.next=null;
        
        temp.next=head;
        
        return newhead;
    }
}
