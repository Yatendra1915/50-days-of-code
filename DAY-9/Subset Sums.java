/*https://practice.geeksforgeeks.org/problems/subset-sums2234/1#*/
class Solution{
    
    private ArrayList<Integer> ans = new ArrayList<>();
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        helper(arr,N,0,0);
        Collections.sort(ans);
        return ans;
    }
    
    public void helper(ArrayList<Integer> arr, int N,int currIndex,int sum){
        if(currIndex==N){
            ans.add(sum);
            
            return;
        }
        helper(arr,N,currIndex+1,sum+arr.get(currIndex));
        helper(arr,N,currIndex+1,sum);

    }
}
