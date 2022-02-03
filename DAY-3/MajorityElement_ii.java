class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        /**using moore's voting algorithm
        we have to check for elements which appear more tha n/3 times
        there will be only 2 such elements in the whole array
        so we will modify the algorithm for 2 elements for example num1 and num2 in this case
        
        similarly if we want to check for elements greater then n/4 then there will be only 3
        such elements
        |----|----|----|----|**/
      
        int num1=Integer.MAX_VALUE,num2=Integer.MAX_VALUE,count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            
            if(num1==nums[i])
                count1++;
            else if(num2==nums[i])
                count2++;
            
            else if(count1==0){
                num1=nums[i];
                    count1=1;
            }
            else if(count2==0){
                num2=nums[i];
                    count2=1;
            }
            
            else{
                count1--;
                count2--;
            }
                
            
        }
      
        /* checking if num1 and num2 are actually occuring n/3 times in array
        if yes then add num1 or num2 based on the occurence*/
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1)
                count1++;
            if(nums[i]==num2)
                count2++;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(count1>nums.length/3)
            arr.add(num1);
        if(count2>nums.length/3)
            arr.add(num2);
        
        return arr;
    }
}
