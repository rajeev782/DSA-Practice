class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int result = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >=numExchange){
            emptyBottles -= numExchange;
            numExchange++;
            result++;
            emptyBottles++;
        }
        return result;
    }
}