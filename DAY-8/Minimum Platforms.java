
/*https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#*/

/*Algorithm:

Sort the arrival and departure times of trains.
Create two pointers i=0, and j=0 and a variable to store ans and current count plat
Run a loop while i<n and j<n and compare the ith element of arrival array and jth element of departure array.
If the arrival time is less than or equal to departure then one more platform is needed so increase the count, i.e. plat++ and increment i
Else if the arrival time greater than departure then one less platform is needed so decrease the count, i.e. plat– and increment j
Update the ans, i.e ans = max(ans, plat).*/
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1,j=0;
        int maxplat=1;
        int plat=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                plat++;
                
                i++;
            }
            
            else if(dep[j]<arr[i]){
                plat--;
                j++;
            }
            
            if(plat>maxplat)
                maxplat=plat;
        }
        
        return maxplat;
    }
    
}
