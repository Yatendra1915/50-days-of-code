//start comparing elements from the back side of arrays
//and start adding the greater among nums1[currIndex] and num2[currIndex] in descending order to the m+n-currposition position
//add remaining elements from nums2 into nums1;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,index=nums1.length-1;
        
        while(i>=0 && j>=0){
            nums1[index--] = nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
        }
        
        while(j>=0){
            nums1[index--]=nums2[j--];
        }
    }
}
