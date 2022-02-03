class Solution {
    int n=0;
    
    public int uniquePaths(int m, int n) {
        return noOfPaths(m-1,n-1,0,0,new HashMap<String,Integer>());
    }
    
    public int noOfPaths(int N,int M,int i, int j,HashMap<String,Integer> memo){
        
        if(i>N || i<0 || j>M || j<0){
            return 0;
        }
        
        if(i==N || j==M){
            return 1;
        }
        
        String currKey = Integer.toString(i)+"_"+Integer.toString(j);
        
        if(memo.containsKey(currKey))
            return memo.get(currKey);
        
        int a =noOfPaths(N,M,i+1,j,memo);
        int b =noOfPaths(N,M,i,j+1,memo);
        
        memo.put(currKey,a+b);
        return a+b;
    }
}
