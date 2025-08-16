class Solution {
    public int maximum69Number (int num) {
       String str = Integer.toString(num);
       String newStr = str.replaceFirst("6", "9");
       return Integer.parseInt(newStr);
    }
}