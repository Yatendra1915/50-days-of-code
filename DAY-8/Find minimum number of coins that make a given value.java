/*Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required
We can use one coin of 25 cents and one of 5 cents 

Input: coins[] = {9, 6, 5, 1}, V = 11
Output: Minimum 2 coins required
We can use one coin of 6 cents and 1 coin of 5 cents*/

class Coins{
  
    static int minCoins(int coins[],int n,int amount){
      
        Arrays.sort(coins);
        
        int res=0;
      
        for(int i=0;i<n;i++){
          
          if(coind[i]<=amount){
            int c=(int)Math.floor(amount/coins[i]);
            res+=c;
            amount=amount-c*coins[i];
          }
          
          if(amount==0)
            break;
        }
      
        return res;
    }
  
}
