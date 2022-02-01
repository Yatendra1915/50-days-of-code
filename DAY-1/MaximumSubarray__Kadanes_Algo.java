class Solution {
    public int maxSubArray(int[] nums) {
      
        //Take first element as maximum
        int sum=nums[0];
        int maxSum=nums[0];
        
        //check at every iteration if currEleement + prevSum is greater than currelement or  not
        //prevSum=max of both;
        //and maxSum = prev Max and curr Sum
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i]+sum,nums[i]);
            maxSum=Math.max(maxSum,sum);
        }
        //return maxSum
        return maxSum;
    }
  
    // TC=O(N)
    // SC=O(N)
}
