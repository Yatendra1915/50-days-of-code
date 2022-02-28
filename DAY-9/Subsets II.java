/*https://leetcode.com/problems/subsets-ii/*/
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,nums.length,list,temp,0);
        
        HashSet<List<Integer>> hs = new HashSet<>();
        
        for(List<Integer> ele:list){
            hs.add(ele);
        }
        
        list.clear();
        
        for(List<Integer> ele:hs){
            list.add(ele);
        }
        
        return list;
    }
    
    public void helper(int nums[],int n,List<List<Integer>> list,List<Integer> temp,int currIndex){
        
        if(currIndex==n){
            list.add(new ArrayList(temp));
            return;
        }
        
        temp.add(nums[currIndex]);
        helper(nums,n,list,temp,currIndex+1);
        temp.remove(temp.size()-1);
        helper(nums,n,list,temp,currIndex+1);
            
    }
}
