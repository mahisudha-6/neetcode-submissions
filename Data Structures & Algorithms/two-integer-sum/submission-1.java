class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                arr[0]=hm.get(complement);
                arr[1]=i;
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}
