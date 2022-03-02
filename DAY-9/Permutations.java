/*https://leetcode.com/problems/permutations/*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        helper(nums,new ArrayList<>(),list,new boolean[nums.length]);
        
        return list;
    }
    
    public void helper(int[] nums,List<Integer> temp,List<List<Integer>> list,boolean[] visited){
        if(nums.length==temp.size()){
            list.add(new ArrayList(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                temp.add(nums[i]);
                helper(nums,temp,list,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }
}
