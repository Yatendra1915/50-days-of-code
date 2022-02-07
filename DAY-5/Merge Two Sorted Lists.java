/*https://leetcode.com/problems/merge-two-sorted-lists/*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode curr1=list1,curr2=list2;
        ListNode temp = new ListNode(-101);
        ListNode ans=temp;
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                temp.next=new ListNode(curr1.val);
                curr1=curr1.next;
            }
            else{
                temp.next=new ListNode(curr2.val);
                curr2=curr2.next;
            }
            temp=temp.next;
        }
        
        if(curr1!=null){
            temp.next=curr1;
        }
        
        else
            temp.next=curr2;
        
        return ans.next;
    }
}
