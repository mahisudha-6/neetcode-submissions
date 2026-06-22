class Solution {
    public String minWindow(String s, String t) {
       int[] freq = new int[128];
       if(s.length()<t.length())
       return "";
       for(char ch:t.toCharArray()){
        freq[ch]++;
       }
       int l=0;
       int start=0;
       int end = Integer.MAX_VALUE;
       int count=t.length();
       for(int right=0;right<s.length();right++){
            freq[s.charAt(right)]--;
            if(freq[s.charAt(right)]>=0){
                count--;
            }
            while(count==0){
                if((right-l+1)<end){
                    end=right-l+1;
                    start=l;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0){
                     count++;
                }
               l++;
            }
       }
       return end==Integer.MAX_VALUE ? "":s.substring(start,start+end);
    }
}