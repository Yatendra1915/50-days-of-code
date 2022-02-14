/*https://leetcode.com/problems/trapping-rain-water/*/
class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        
        int res=Integer.MIN_VALUE ;
        
        for(int i=0;i<n;i++){
            res=Math.max(res,height[i]);
            lmax[i]=res;
        }
        
        res=Integer.MIN_VALUE ;
        
        for(int i=n-1;i>-1;i--){
            res=Math.max(res,height[i]);
            rmax[i]=res;
        }
        res=0;
        
        for(int i=0;i<n;i++){
            res=res+(Math.min(lmax[i],rmax[i])-height[i]);
        }
        
        return res;
        
    }
}
