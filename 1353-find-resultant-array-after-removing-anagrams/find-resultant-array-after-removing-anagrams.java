class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        result.add(words[0]);

        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i],words[i-1])){
                result.add(words[i]);

            }
        }
        return result;
    }
    private static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        
        }
        return true;
    }
}