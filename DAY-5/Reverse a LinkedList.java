/*https://leetcode.com/problems/reverse-linked-list/*/

//Iterative
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}

//Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }   
    public ListNode reverse(ListNode curr,ListNode prev){
        if(curr==null)
            return prev;
        
        ListNode next=curr.next;
        curr.next=prev;
        
        return reverse(next,curr);
    }
}
