/*https://leetcode.com/problems/permutation-sequence/*/

class Solution {
    
    int count=0;
    String res ="";
    public String getPermutation(int n, int k) {
        helper(n,k,new boolean[n+1],new StringBuilder());
        return res;
    }
    
    public void helper(int n,int k,boolean visited[],StringBuilder s){
        
        if(s.length()==n){
            //we'll get all the permutations in already sorted order so just count if couunt==k
            count++;
            if(count==k){
                res=s.toString();
            }
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                s.append(i);
                visited[i]=true;
                helper(n,k,visited,s);
                visited[i]=false;
                s.setLength(s.length()-1);
            }
        }
    }
}
