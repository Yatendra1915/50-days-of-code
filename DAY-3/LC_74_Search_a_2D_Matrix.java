class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        return binary(matrix,0,(matrix.length*matrix[0].length)-1,target);
    }
    
    public boolean binary(int[][] matrix,int low,int high,int target){
        
        while(low<=high){

            int mid=(low+high)/2;
           
            if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target)
                return true;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length]<target){
                low=mid+1;
            }
            else
                high=mid-1;
        
        }
        
        return false;
    }
}
