/*https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1*/
class Meet{
    
    int start;
    int end;
    int position;
    
    Meet(int start,int end,int position){
        this.start=start;
        this.end = end;
        this.position=position;
    }
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Meet> arr = new ArrayList<>();
        //add all meetings with start end and pos in arr;
        for(int i=0;i<start.length;i++){
            arr.add(new Meet(start[i],end[i],i+1));
        }
        //sort them wrt end time in asc order
        Collections.sort(arr,(a,b)->a.end-b.end);
        
        //find non overlaping meetings
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr.get(0).position);
        
        int limit = arr.get(0).end;
        
        for(int i=1;i<start.length;i++){
            if(limit<arr.get(i).start){
                limit=arr.get(i).end;
                ans.add(arr.get(i).position);
            }
        }
        
        return ans.size();
        
    }
}
