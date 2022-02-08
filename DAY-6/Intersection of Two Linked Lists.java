/*https://leetcode.com/problems/intersection-of-two-linked-lists/*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lenA=lengthOfLL(headA);
        int lenB=lengthOfLL(headB);
        
        int diff=Math.abs(lenA-lenB);
        
        if(lenA>lenB){
            while(diff-->0){
                headA=headA.next;
            }
        }
        else{
            while(diff-->0){
                headB=headB.next;
            }
        }
        
        while(headA!=null && headB!=null && headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        
        return headA;
    }
    
    public int lengthOfLL(ListNode head){
        
        int count=0;
        
        while(head!=null){
            head=head.next;
            count++;
        }
        
        return count;
    }
}
