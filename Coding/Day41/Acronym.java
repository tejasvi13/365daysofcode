//Question:https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        int m=s.length();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            String str=words.get(i);
            if(str.charAt(0)== s.charAt(i)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}