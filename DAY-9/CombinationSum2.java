/*https://leetcode.com/problems/combination-sum-ii/*/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        helper(candidates,target,list,temp,0);
        
        
        return list;
    }
    
    public void helper(int[] candidates, int target,List<List<Integer>> list,List<Integer> temp,int currIndex){
        
        if(target==0){
            list.add(new ArrayList(temp));
            return;
        }
            
        if(currIndex==candidates.length)
            return;
        
        if(target-candidates[currIndex]>=0){
            temp.add(candidates[currIndex]);
            helper(candidates,target-candidates[currIndex],list,temp,currIndex+1);
            temp.remove(temp.size()-1);
            
        }
        
        while(currIndex<candidates.length-1 && candidates[currIndex+1]==candidates[currIndex])
            currIndex++;
        helper(candidates,target,list,temp,currIndex+1);
        
    }
}
