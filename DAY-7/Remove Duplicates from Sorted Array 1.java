/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/*/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int temp=0;
        for(int i=1;i<nums.length;i++){
            if(nums[temp]!=nums[i]){
                temp++;
                nums[temp]=nums[i];
            }
        }
        
        return temp+1;
    }
}
