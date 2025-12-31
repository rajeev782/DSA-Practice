class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int childIndx = 0;
        int cookiesIndx =0;
        while(childIndx<g.length && cookiesIndx< s.length){
            if(s[cookiesIndx]>=g[childIndx]){
                childIndx++;
            }
            cookiesIndx++;
        }
        return childIndx;
    }
}