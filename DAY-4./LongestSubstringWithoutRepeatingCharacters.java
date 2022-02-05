class Solution {
    
    Set<Character> set = new HashSet<>();
    
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int max=0;
        
        while(end<s.length()){
            
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max=Math.max(max,set.size());
            }
            
            else{
                //start removing from start and increment start;
                set.remove(s.charAt(start));
                start++;
            }
            
        }
        
        return max;
    }
}
