class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        for(int c: citations){
            if(c>=n){
                arr[n]+=1;
            }else{
                arr[c]+=1;
            }
        }
        int count = 0;
        for(int i = arr.length-1;i>=0;i--){
            count+=arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;

    }
}