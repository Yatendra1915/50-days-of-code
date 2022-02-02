class Solution {
    public int[][] merge(int[][] intervals) {
      
        //create an empty list
        ArrayList<int[]> arr = new ArrayList<>();
        
      //Sort the arrays wrt 1st element of 1d arrays in 2d array
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        
        
        int low=intervals[0][0];
        int high=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            //if 1st element of ith array is less than curr high then update high
            if(intervals[i][0]<=high){
                high=Math.max(high,intervals[i][1]);
            }
            //if low and high are non overlapping then add them to list and update low and high
            else{
                arr.add(new int[]{low,high});
                low=intervals[i][0];
                high=intervals[i][1];
            }
        }
        //add last low and highs
        arr.add(new int[]{low,high});
        //convert list to array;
        return arr.toArray(new int[0][]);
    }
}
