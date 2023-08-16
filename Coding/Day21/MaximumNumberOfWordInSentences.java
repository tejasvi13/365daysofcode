//Question:https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String s[]=sentences[i].split(" ");
            int n=s.length;
            if(n>max){
                max=n;
            }
        }
        return max;
    }
}