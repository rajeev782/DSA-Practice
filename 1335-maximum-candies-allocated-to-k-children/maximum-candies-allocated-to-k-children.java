class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0; 
        int max = 0;
        
        for(int i : candies){
            sum += i;
            max = Math.max(max, i);
        }
        if(sum < k) return 0;
        
        int start = 1;
        int end = max;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(isValid(candies, k, mid)){
                ans = mid;      
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    
    private static boolean isValid(int[] arr, long k, int size){
        if(size == 0) return true;
        long total = 0; 
        
        for(int i : arr){
            total += i / size;
            if(total >= k){
                return true;
            }
        }
        return total >= k;
    }
}