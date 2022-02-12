/*https://leetcode.com/problems/reverse-nodes-in-k-group/*/
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
          
        int n =0;
        
        ListNode temp = head;
        
        while(temp!=null){temp=temp.next; n++;}
        if(k<2) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode pre = dummy;
        ListNode curr = dummy;
        ListNode next = dummy;
        
        while(n>=k){
            curr=pre.next;
            next=curr.next;
            
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=pre.next;
                pre.next=next;
                next=curr.next;
            }
            
            pre=curr;
            n-=k;
        }
        
        return dummy.next;
    }
}
