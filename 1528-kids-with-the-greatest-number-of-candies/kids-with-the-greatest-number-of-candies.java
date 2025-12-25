class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = candies[0];
        for(int i =0;i<n;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0;i<n;i++){
            int currentCandy = candies[i]+extraCandies;
            result.add(currentCandy>=max);
        }
        return result;

    }
}