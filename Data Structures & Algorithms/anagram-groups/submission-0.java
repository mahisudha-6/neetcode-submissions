class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String,List<String>> hm = new HashMap<>();
       for(String str:strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
        if(!hm.containsKey(sorted)){
            hm.put(sorted,new ArrayList<>());
        }
        hm.get(sorted).add(str);
       }
       return new ArrayList<>(hm.values());
    }
}
