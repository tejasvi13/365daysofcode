//Question :https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int l=0;int r=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='L'){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                c++;
                l=0;r=0;
            }
        }
        return c;
    }
}