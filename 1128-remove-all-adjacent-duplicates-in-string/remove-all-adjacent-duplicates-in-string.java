class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> letters = new Stack<>();
        for(char c: s.toCharArray()){
            if(!letters.isEmpty() && letters.peek()==c){
                letters.pop();
            }else{
                letters.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : letters){
            sb.append(c);
        }
        return sb.toString();

    }
}