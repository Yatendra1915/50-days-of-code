class Solution {
    public void nextPermutation(int[] nums) {
        
        //Find the last peak of the array      
        int peak=-1;
        int i=1;
        while(i<nums.length){
            if(nums[i-1]<nums[i]){
                peak=i;
            }
            
            i++;
        }
        
        //if  no peak found that means elements are in descending order
        //Sort the array as given in question desc.
        if(peak==-1){
            Arrays.sort(nums);
            return;
        }
        
        //find element greater than nums[peak-1] and less than nums[peak]
        //upadate index at every true if condition;
        // that is find the element less than peak && which is closest to peak
        int index=peak;
        
        for(i=peak;i<nums.length;i++){
            if(nums[i]>nums[peak-1] && nums[i]<nums[index])
                index=i;
        }
        
        //swap index ele with peak-1 ele;
        int temp=nums[index];
        nums[index]=nums[peak-1];
        nums[peak-1]=temp;
        
        //sort the array from peak till end;
        Arrays.sort(nums,peak,nums.length);
        
    }
}
