//Question:https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        int f=1;
        char st[]=s.toCharArray();
        char str[]=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(str);
        if(st.length!=str.length){
            return false;
        }
        for(int i=0;i<st.length;i++){
                if(st[i]!=str[i]){
                    f=0;
                    return false;
                }
        }
        if(f==1){
            return true;
        }
        else{
            return false;
        }
    }
}