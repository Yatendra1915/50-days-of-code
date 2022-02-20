class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        
        Arrays.sort(arr,new Comparator<Item>(){
            
            public int compare(Item a,Item b){
                return ((b.value*b.weight) - (a.value*a.weight));
            }
        });
        
        
        double maxValue=0;
        for(int i=0;i<n;i++){
            if(W>=arr[i].weight){
                W-=arr[i].weight;
                maxValue+=arr[i].value;
            }
            else{
                maxValue+=W*(arr[i].value/arr[i].weight);
                break;
            }
        }
        
        return maxValue;
    }
}
