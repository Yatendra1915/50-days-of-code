
/*https://leetcode.com/problems/add-two-numbers/*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int temp=0;
        
        ListNode curr1=l1,curr2=l2;
        
        ListNode ans = new ListNode(-1);
        ListNode ret = ans;
        while(curr1!=null && curr2!=null){
            
            int sum=temp+curr1.val+curr2.val;
            ans.next=new ListNode(sum%10);
            temp=sum/10;
            
            curr1=curr1.next;
            curr2=curr2.next;
            ans=ans.next;
        }
        
        while(curr1!=null){
            
            int sum = temp+curr1.val;
            
            ans.next=new ListNode(sum%10);
            temp=sum/10;
            
            curr1=curr1.next;
            ans=ans.next;
        }
        
         while(curr2!=null){
            
            int sum = temp+curr2.val;
            
            ans.next=new ListNode(sum%10);
            temp=sum/10;
            
            curr2=curr2.next;
            ans=ans.next;
        }
        
        while(temp!=0){
            ans.next=new ListNode(temp%10);
            temp=temp/10;
            ans=ans.next;
        }
        
        return ret.next;
    }
}
