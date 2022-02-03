class Solution {
    public double myPow(double x, int n) {
      //if n is zero simply return 1;
        if(n==0)
            return 1;
        
      /*handeled for special testcase*/
        if(n == Integer.MIN_VALUE){
            x = x * x;
            n = n/2;
        }
        
      /* if n<0 x=1/x and make n positive 
      this block will only be executed once*/
        if(n<0){
            x=1/x;
            n=-n;
        }
        
      /*in n<0 case x=1/x and n = positive n */
        return (n%2==0) ? myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}
