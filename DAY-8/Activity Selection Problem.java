class Activity{
  int start,end;
  
  Activity(start,end){
    this.start=start;
    this.end  = end;
  }
}
class ActivitySelection{

  public static int maxActivity(Activity[] arr){
    
      // sort the activities wrt finish time in asc order
      Arrays.sort(arr,new Comparator<Activity[]>(){
          public int compare(Activity a1,Activity a2){
            return a1.finish-a2.finish;
          }
      });
    
      // take first activity and check count number of non overlapping activities
      Activity prev=Activity[0];
      int count=1;
      for(int curr=1;i<Activity.length;i++){
        if(prev.finish<=curr.start){
          count++;
          prev=curr.finish;
        }
      }
    return count;
  }
  
  public static void main(String args[]){
    Activity[] ac= {new Activity(0,5),new Activity(5,7),new Activity(8,9),new Activity(4,6),new Activity(1,15)};
    
    System.out.println(maxActivity(ac));
    
  }

}
