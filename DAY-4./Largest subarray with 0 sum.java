//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#

class GfG
{
    int maxLen(int arr[], int n)
    {
        
        HashMap<Integer,Integer> hs = new HashMap<>();   
        
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==0)
                max=Math.max(max,i+1);
           
           else{     
                if(hs.containsKey(sum)){
                    max=Math.max(max,i-hs.get(sum));
                }
            
                else
                    hs.put(sum,i);
           }
        }
        
        return max;
    }
}
/*/*
Mathematical Proof:  



prefix(i) = arr[0] + arr[1] +...+ arr[i] 
prefix(j) = arr[0] + arr[1] +...+ arr[j], j>i 
ifprefix(i) == prefix(j) then prefix(j) - prefix(i) = 0 that means arr[i+1] + .. + arr[j] = 0, So a sub-array has zero sum , and the length of that sub-array is j-i+1  



Algorithm:  


Create an extra space, an array of length n (prefix), a variable (sum), length (max_len), and a hash map (hm) to store the sum-index pair as a key-value pair.
Move along the input array from the start to the end.
For every index, update the value of sum = sum + array[i].
Check every index, if the current sum is present in the hash map or not.
If present, update the value of max_len to a maximum difference of two indices (current index and index in the hash-map) and max_len.
Else, put the value (sum) in the hash map, with the index as a key-value pair.
Print the maximum length (max_len).
*/*/
