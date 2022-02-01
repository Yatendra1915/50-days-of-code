class Solution {
    public int maxProfit(int[] prices) {
        return helper(prices,0,true,1,new HashMap<String,Integer>());
    }
    
    public int helper(int[] prices,int currIndex,boolean canBuy,int transactions,HashMap<String,Integer> memo){
        
        if(currIndex==prices.length || transactions==0)
            return 0;
        
        String currKey = " "+currIndex+" "+canBuy+" "+transactions;
        if(memo.containsKey(currKey))
            return memo.get(currKey);
        
        int ideal = helper(prices,currIndex+1,canBuy,transactions,memo);
        
        if(canBuy){
            int buy = -prices[currIndex]+helper(prices,currIndex+1,!canBuy,transactions,memo);
            memo.put(currKey,Math.max(ideal,buy));
            return Math.max(ideal,buy);
        }
        else{
            int sell= prices[currIndex]+helper(prices,currIndex+1,canBuy,transactions-1,memo);
            memo.put(currKey,Math.max(ideal,sell));
            return Math.max(ideal,sell);
            
        }
        
    }
}
