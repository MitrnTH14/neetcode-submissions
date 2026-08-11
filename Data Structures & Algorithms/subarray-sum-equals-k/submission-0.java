class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int current=0;
        Map<Integer,Integer>prefixSum=new HashMap<>();
        prefixSum.put(0,1);
        for(int num:nums){
            current+=num;
            if(prefixSum.containsKey(current-k)){
            count+=prefixSum.get(current-k);
        }
        prefixSum.put(current,prefixSum.getOrDefault(current,0)+1);
        }
        return count;
    }
}