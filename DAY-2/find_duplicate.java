/*Input: nums = [3,1,3,4,2]
Output: 3


indexes = 0   1   2   3  4
values =  3   2   3   4  1
  
  3 -> 4 -> 1 ->2->3->
       |             |
       ^--<--<-<-----
   
   -The idea is to use slow and fast pointers;
   -check for the loop in the array
   -when found
   -set fast = 0;
   -then move slow and fast with same pace,unitt they meet
   -they'll meet at duplicate elemet
   
*/


class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow= nums[0];
        int fast=nums[nums[0]];
        
      
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        
        fast=0;
        
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        
        return slow;
    }
}
