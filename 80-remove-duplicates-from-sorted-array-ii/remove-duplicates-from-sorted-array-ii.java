class Solution {
    public int removeDuplicates(int[] nums) {
      Map<Integer,Integer> result = new LinkedHashMap<>();
      for(int num:nums){
        result.put(num,result.getOrDefault(num,0)+1);
      } 
      int k = 0;
      for(Map.Entry<Integer, Integer> entry: result.entrySet()){
        int number = entry.getKey();
        int count = entry.getValue();

        int timesToAdd = Math.min(count,2);
        for(int i = 0;i<timesToAdd;i++){
            nums[k] = number;
            k++;
        }
      }
      return k;
    }
}