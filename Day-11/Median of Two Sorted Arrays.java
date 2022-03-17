/*https://leetcode.com/problems/median-of-two-sorted-arrays/*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums2.length<nums1.length)
            return findMedianSortedArrays(nums2,nums1);
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int begin1=0,end1=n1;
        
        while(begin1<=end1){
            int i1=(begin1+end1)/2;
            int i2=(n1+n2+1)/2 - i1;
            
            int max1 =(i1==0)?Integer.MIN_VALUE:nums1[i1-1];
            int max2 =(i2==0)?Integer.MIN_VALUE:nums2[i2-1];
            int min1 =(i1==n1)?Integer.MAX_VALUE:nums1[i1];
            int min2 =(i2==n2)?Integer.MAX_VALUE:nums2[i2];
            
            if((max1<=min2) && (max2<=min1)){
                if((n1+n2)%2 ==0)
                    return ((double) (Math.max(max1,max2)+Math.min(min1,min2))/2);
                else
                    return ((double) Math.max(max1,max2)/2);
            }
            
            else if(max2>min1)
                begin1 =begin1+1;
            else
                end1=end1-1;
        }
        return 0.0;
    }
}
