class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] freq = new int[128];
        for(int i=0; i<t.length(); i++){
            freq[t.charAt(i)] ++;
        }
        int l=0, start = 0, end = Integer.MAX_VALUE, count = t.length();
        for(int r=0; r<s.length(); r++){
            freq[s.charAt(r)] --;
            if(freq[s.charAt(r)] >= 0){
                count --;
            }
            while(count == 0){
                if((r-l+1) < end ){
                    start = l;
                    end = r - l + 1;
                }
                freq[s.charAt(l)] ++;
                if (freq[s.charAt(l)] > 0) count++;
                l++;
            }
        }
        if (end == Integer.MAX_VALUE) return "";
        return s.substring(start, start+end);
    }
}