/*https://leetcode.com/problems/max-consecutive-ones/submissions/*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
                ans =Math.max(max,ans);
            }
            else{
                max=0;
            }
        }
        
        return ans;
    }
}
