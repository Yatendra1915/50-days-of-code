/*https://leetcode.com/problems/3sum/*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            
            int low = i+1,high=n-1;
            
            while(low<high){
                
                if(nums[low]+nums[high]+nums[i]>0){
                    high--;
                }
                else if(nums[low]+nums[high]+nums[i]<0){
                    low++;
                }
                
                else{
                    List<Integer> temp = new ArrayList<>();
                    
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    
                    list.add(temp);
                    
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    
                    low++;
                    high--;
                }
            }
            
            while(i<n-1 && nums[i]==nums[i+1]) i++;
        }
        
        return list;
    }
}
