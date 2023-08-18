//Question: https://leetcode.com/problems/truncate-sentence/description/
class Solution {
    public String truncateSentence(String s, int k) {
        String st[]=s.split(" ");
        String str="";
        for(int i=0;i<k-1;i++){
            str+= st[i]+" ";
        }
        str+= st[k-1];
        return str;
    }
}