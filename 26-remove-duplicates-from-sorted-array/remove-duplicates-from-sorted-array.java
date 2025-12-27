class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> result = new LinkedHashMap<>();
        for(int i = 0;i<n;i++){
            result.put(nums[i],result.getOrDefault(nums[i],0)+1);
        }
        
        int k = 0;
        for(Map.Entry<Integer,Integer> entry:result.entrySet()){
            nums[k] = entry.getKey();
            k++;
        }
        return k;
    }
}