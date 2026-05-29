class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int max=0;
       for(int x:nums){
        set.add(x);
       } 
       for(int curr:set){
          if(!set.contains(curr-1)){
              int length =1;
              while(set.contains(curr+length)){
                length++;
              }
              max=Math.max(length,max);
          }
       }
       return max;
    }
}
