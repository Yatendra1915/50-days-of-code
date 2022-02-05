class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    
    public int longestConsecutive(int[] nums) {
        
        for(int i:nums)
            set.add(i);
        
        int count=0,max=0;
        
        for(int i:nums){
            //if condition is to optimize the solution a little bit
            
            if(!set.contains(i-1))
            {
                count=1;
                while(set.contains(i+1)){
                    count++;
                    i=i+1;
                }
                max=Math.max(count,max);
            }
                
        }
            
        return max;
    }
}
