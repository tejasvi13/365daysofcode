//Question:https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String st="";
        String s="";
        for(int i=0;i<word1.length;i++){
            st+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            s+=word2[i];
        }
        if(st.equals(s)){
            return true;
        }
        return false;
    }
}