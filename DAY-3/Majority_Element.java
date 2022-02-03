/*
The idea is to use moore's voting algorithm
-> if current element is not same as majority element decrease counter
     -if counter reaches zero update counter to 1 andassign current element as majority element
-> if curr element is same as majority element then increase counter;
   
-> At last return majority element
*/

class Solution {
    public int majorityElement(int[] nums) {
        
        int majority=nums[0];
        int count=1;
        
        for(int i=1;i<nums.length;i++){            
            if(majority!=nums[i]){
                count--;
                
                if(count==0){
                    count=1;
                    majority=nums[i];
                }            
            }
           else
                count++;          
        }        
        return majority;
    }
}
